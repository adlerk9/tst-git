package br.nom.adler.pet.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.nom.adler.pet.interfases.IControler;
import br.nom.adler.pet.interfases.IPersistencia;
import br.nom.adler.pet.interfases.IPet;
import br.nom.adler.pet.model.Pet;
import br.nom.adler.pet.model.Procedimento;
import br.nom.adler.pet.util.Util;

public class PetForm extends BaseForm implements IPersistencia, IPet {

	private static final long serialVersionUID = -5491278999236426852L;

	private Integer id = null;
	private ClienteForm cliente;
	private JTextField editNome;
	private JTextField editEspecie;
	private JTextField editPeso;
	private JTextField editNascimento;
	private JList<Procedimento> listaProcedimentos;

	public PetForm(ClienteForm cliente) {
		super("Control Pet", 300, 300, 600, 490);
		this.cliente = cliente;
		final PetForm form = this;
		editNome = montarTexto("Nome", 260);
		editEspecie = montarTexto("Especie", 260);
		editPeso = montarTexto("Peso", 260);
		editNascimento = montarTexto("Data de nascimento", 260);
		proximaLinha();
		montarBotao("Salvar", 260).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickSalvar();
			}
		});
		montarBotao("Novo Procedimento", 260).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProcedimentoForm(form);
			}
		});
		listaProcedimentos = new JList<Procedimento>();
		listaProcedimentos.addMouseListener(new MouseListener() {			
			public void mouseReleased(MouseEvent e) {	}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				clickLista();
			}
		});
		JScrollPane scroll = new JScrollPane(listaProcedimentos);
		scroll.setBounds(5, y + 60, 570, 250);
		desktop.add(scroll);
		setVisible(true);
	}
	
	private void clickSalvar() {
		try {
			getControler().salvarPet(this);
			cliente.atualizarList();
		} catch (ParseException e) {
			Util.mensagem("Voce errou o preencimento da data de nascimento!!!!");
		} catch ( java.lang.NumberFormatException e) {
			Util.mensagem("O peso é obrigatorio!!!");
		}
	}
	public IControler getControler() {
		return cliente.getControler();
	}

	public int getId() {
		if (id == null) {
			id = getControler().nextIdPet();
		}
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return editNome.getText();
	}

	public void setNome(String nome) {
		editNome.setText(nome);

	}

	public String getEspecie() {
		return editEspecie.getText();
	}

	public void setEspecie(String especie) {
		editEspecie.setText(especie);
	}

	public float getPeso() {
		return Float.parseFloat(editPeso.getText()) ;
	}

	public void setPeso(float peso) {
		editPeso.setText(Float.toString(peso));

	}

	
	public Date getNascimento() throws ParseException {
		String str = editNascimento.getText().trim();
		if (str.equals("")) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy" );
		return sdf.parse(str);
	}


	public void setNascimento(Date nascimento) {
		if (nascimento == null) {
			editNascimento.setText((""));
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			editNascimento.setText(sdf.format(nascimento));
		}		

	}

	public int getIdTutor() {
		return cliente.getId();
	}

	public void setIdTutor(int idTutor) {
		cliente.setId(idTutor);

	}

	public void setPet(Pet pet) {
		setId(pet.getId());
		setPeso(pet.getPeso());
		setEspecie(pet.getEspecie());
		setNome(pet.getNome());
		setNascimento(pet.getNascimento());
		atualizarList();
		
	}
	public void atualizarList() {
		DefaultListModel<Procedimento> model =new DefaultListModel<Procedimento>();
		for (Procedimento item: getControler().findProcedimento(getId())) {
			model.addElement(item);
		}
		
		listaProcedimentos.setModel(model);
	}
	private void clickLista() {
		Procedimento procedimento = listaProcedimentos.getSelectedValue();
		if(procedimento != null) {
			new ProcedimentoForm(this).setProcedimento(procedimento);
		}
	}
}