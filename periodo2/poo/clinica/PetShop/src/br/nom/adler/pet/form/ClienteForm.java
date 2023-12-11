package br.nom.adler.pet.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.nom.adler.pet.interfases.ICliente;
import br.nom.adler.pet.interfases.IControler;
import br.nom.adler.pet.interfases.IPersistencia;
import br.nom.adler.pet.model.Cliente;
import br.nom.adler.pet.model.Pet;


public class ClienteForm extends BaseForm implements IPersistencia,ICliente{

	private static final long serialVersionUID = 7667383352225943097L;

	private Integer id = null;
	private JTextField edtNome;
	private JTextField edtTelefone;
	private JTextField edtRedeSocial;
	private JTextField edtEndereco;
	private  JList<Pet> listaPet;
	private ClinicaForm principal;

	public ClienteForm(ClinicaForm principal) {
		super("Cadastro De Cliente", 300, 0, 1200, 300);
		final ClienteForm form = this;
		this.principal = principal;
		edtNome = montarTexto("Nome", 300);
		edtTelefone = montarTexto("Telefone", 300);
		proximaLinha();
		edtRedeSocial = montarTexto("Rede Social", 605);
		proximaLinha();
		edtEndereco = montarTexto("Endereço", 605);

		listaPet = new JList<Pet>();
		listaPet.addMouseListener(new MouseListener() {			
			public void mouseReleased(MouseEvent e) {	}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				clickLista();
			}
		});
		JScrollPane scroll = new JScrollPane(listaPet);
		scroll.setBounds(620, 10, 450, 250);
		desktop.add(scroll);
		proximaLinha();
		montarBotao("Salvar", 300).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickSalvar();
			}
		});
		montarBotao("Novo Pet", 300).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PetForm(form);
			}
		});


		setVisible(true);

	}

	public IControler getControler() {
		return principal.getControler();
	}

	public int getId() {
		if (id == null) {
			id = getControler().nextIdCliente();
		}
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}

	public String getNome() {
		return edtNome.getText();
	}

	public void setNome(String nome) {
		edtNome.setText(nome);

	}

	public String getTelefone() {
		return edtTelefone.getText();
	}


	public void setTelefone(String telefone) {
		edtTelefone.setText(telefone);

	}


	public String getRedeSocial() {
		return edtRedeSocial.getText();
	}

	public void setRedeSocial(String redeSocial) {
		edtRedeSocial.setText(redeSocial);

	}

	public String getEndereco() {
		return edtEndereco.getText();
	}

	public void setEndereco(String endereco) {
		edtEndereco.setText(endereco);
	}

	private void clickSalvar() {
		getControler().salvarCliente(this);
		principal.atualizarList();
	}

	public void setCliente(Cliente c) {
		setId(c.getId());
		setNome(c.getNome());
		setRedeSocial(c.getRedeSocial());
		setEndereco(c.getEndereco());
		setTelefone(c.getTelefone());
		atualizarList();
	}
	public void atualizarList() {
		DefaultListModel<Pet> model =new DefaultListModel<Pet>();
		for (Pet item: getControler().findPet(getId())) {
			model.addElement(item);
		}
		
		listaPet.setModel(model);
	}
	private void clickLista() {
		Pet pet = listaPet.getSelectedValue();
		if(pet != null) {
			new PetForm(this).setPet(pet);
		}
	}
}
