package br.nom.adler.pet.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.nom.adler.pet.interfases.IControler;
import br.nom.adler.pet.interfases.IPersistencia;
import br.nom.adler.pet.interfases.IProcedimento;
import br.nom.adler.pet.model.Procedimento;
import br.nom.adler.pet.util.Util;

public class ProcedimentoForm extends BaseForm implements IProcedimento,IPersistencia{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id = null;
	private JTextField edtData;
	private JTextField	edtPago;
	private JTextField edtValor;
	private JTextArea	edtMaterias;
	private JTextArea	edtObservacao;
	private JTextArea	edtDescricao;
	private PetForm principal;
	
	public ProcedimentoForm(PetForm principal) {
		super("Procedimentos", 900, 300, 600, 490);	
		this.principal = principal;
		edtData = montarTexto("Data e Hora", 170);
		edtValor = montarTexto("Valor Total", 170);
		edtPago = montarTexto("Valor Pago", 170);
		edtDescricao = montarTextoArea("Descrição", 525, 90);
		edtObservacao = montarTextoArea("Observação", 525, 90);
		edtMaterias = montarTextoArea("Materiais", 525, 90);
		montarBotao("Salvar", 260).addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				clickSalvar();
			}
		});
		montarBotao("Cancelar",260).addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				clickFechar();
			}
		});
		setDataHora(new Date());
		setVisible(true);	
	}
	
	private void clickFechar() {
		setVisible(false);
	}
	
	private void clickSalvar() {
		try {
			getControler().salvarProcedimento(this);
			principal.atualizarList();
		} catch (ParseException e) {
			Util.mensagem("Erro no Salvamento da DATA");
		};
	}

	public int getId() {
		if(id == null) { 
			id = getControler().nextIdProcedimento();
		}
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdPet() {
		return principal.getId();
	}
	
	public void setIdPet(int idPet) {
		principal.setId(idPet);
	}

	public Date getDataHora() throws ParseException {
		String str = edtData.getText().trim();
		if (str.equals("")) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm" );
		return sdf.parse(str);
	}
	public void setDataHora(Date dataHora) {
		if (dataHora == null) {
			edtData.setText((""));
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			edtData.setText(sdf.format(dataHora));
		}		
	}
	public String getDescricao() {
		return edtDescricao.getText();
	}

	public void setDescricao(String descricao) {
		edtDescricao.setText(descricao);
	}
	public String getMateriais() {
		return edtMaterias.getText();
	}
	public void setMateriais(String materiais) {
		edtMaterias.setText(materiais);
	}

	public String getObservacao() {
		return edtObservacao.getText();
	}
	public void setObservacao(String observacao) {
		edtObservacao.setText(observacao);
	}
	public long getValorCobrado() {
		return Util.strToLong(edtValor.getText());
	}
	public void setValorCobrado(long valorCobrado) {
		edtValor.setText(Util.longToStr(valorCobrado));
	}
	public long getValorPago() {
		return Util.strToLong(edtPago.getText());
	}
	public void setValorPago(long valorPago) {
		edtPago.setText(Util.longToStr(valorPago));
		
	}
	public IControler getControler() {
		return principal.getControler();
	}

	public void setProcedimento(Procedimento p) {
		setId(p.getId());
		setDescricao(p.getDescricao());
		setObservacao(p.getObservacao());
		setMateriais(p.getMateriais());
		setDataHora(p.getDataHora());
		setValorPago(p.getValorPago());
		setValorCobrado(p.getValorCobrado());
		
		
	}
}
