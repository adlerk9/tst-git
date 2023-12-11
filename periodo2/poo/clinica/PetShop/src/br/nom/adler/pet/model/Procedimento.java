package br.nom.adler.pet.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.nom.adler.pet.interfases.IProcedimento;

public class Procedimento implements IProcedimento{

	private int id;
	private int idPet;
	private Date dataHora;
	private String descricao;
	private String materiais;
	private String observacao;
	private long valorCobrado;
	private long valorPago;

	public Procedimento() {}

	public Procedimento(IProcedimento modelo) throws ParseException {
		setDados(modelo);
	}
	public void setDados(IProcedimento modelo) throws ParseException {
		id = modelo.getId();
		idPet = modelo.getIdPet();
		dataHora = modelo.getDataHora();
		descricao = modelo.getDescricao();
		materiais = modelo.getMateriais();
		observacao = modelo.getObservacao();
		valorCobrado = modelo.getValorCobrado();
		valorPago = modelo.getValorPago();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPet() {
		return idPet;
	}
	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMateriais() {
		return materiais;
	}
	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public long getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(long valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	public long getValorPago() {
		return valorPago;
	}
	public void setValorPago(long valorPago) {
		this.valorPago = valorPago;
	}
	@Override
	public String toString() {
		if (dataHora != null) {
			return new SimpleDateFormat().format(dataHora) + " - " + descricao; 
		} else {
			return " * " + descricao;
		}
	}

	

}
