package br.nom.adler.pet.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import com.google.gson.Gson;

import br.nom.adler.pet.dao.BaseDAO;
import br.nom.adler.pet.interfases.IControler;
import br.nom.adler.pet.interfases.IPersistencia;
import br.nom.adler.pet.mb.GeralMB;
import br.nom.adler.pet.model.Cliente;
import br.nom.adler.pet.util.Util;

public class ClinicaForm extends BaseForm implements IPersistencia{

	private static final long serialVersionUID = -7458195889382436177L;
	
	private File file = new File("Clinica.Canine");
	private BaseDAO base = new BaseDAO();	
	private GeralMB geralMB;
	
	private JList<Cliente> listCliente;
	
	public ClinicaForm() {
		super("Sistema de controle veterinário", 0, 0, 310, 790);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				if(file.exists()) {
					file.delete();
				}
				try {
					String dados = new Gson().toJson(base);
					FileOutputStream out = new FileOutputStream(file);
					out.write(dados.getBytes());
					out.close();
				} catch (Exception e1) {
					Util.mensagem("Dados não salvos");
					e1.printStackTrace();
				}
				
            	 System.exit(0);
            }
		});
		
		//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if(file.exists()) {
			try {
				Gson gson = new Gson();
				Reader reader = new FileReader(file);
				base = gson.fromJson(reader, BaseDAO.class);
			} catch (FileNotFoundException e1) {
				base = new BaseDAO();	
			}			
		}
		
		geralMB = new GeralMB(base);
		final ClinicaForm form = this;		
		montarBotao("Cadastrar novo cliente", 270).addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				new ClienteForm(form);				
			}
		});
		listCliente = new JList<Cliente>();
		listCliente.addMouseListener(new MouseListener() {			
			public void mouseReleased(MouseEvent e) {	}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				clickLista();
			}
		});
		JScrollPane scroll = new JScrollPane(listCliente);
		scroll.setBounds(5,y+70,280,650);
		desktop.add(scroll);
		atualizarList();
		setVisible(true);
	}

	
	public IControler getControler() {
		return geralMB;
	}
	public void atualizarList() {
		DefaultListModel<Cliente> model =new DefaultListModel<Cliente>();
		for (Cliente item: getControler().findAllCliente()) {
			model.addElement(item);
		}
		listCliente.setModel(model);
	}
	private void clickLista() {
		Cliente cliente = listCliente.getSelectedValue();
		if(cliente != null) {
			new ClienteForm(this).setCliente(cliente);
		}
	}
}
