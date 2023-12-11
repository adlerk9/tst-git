package br.nom.adler.pet.interfases;

import java.text.ParseException;
import java.util.Date;

public interface IProcedimento {
	
	public int getId();
	public void setId(int id);
	public int getIdPet();
	public void setIdPet(int idPet);
	public Date getDataHora() throws ParseException;
	public void setDataHora(Date dataHora);
	public String getDescricao();
	public void setDescricao(String descricao);
	public String getMateriais();
	public void setMateriais(String materiais);
	public String getObservacao();
	public void setObservacao(String observacao);
	public long getValorCobrado();
	public void setValorCobrado(long valorCobrado);
	public long getValorPago() ;
	public void setValorPago(long valorPago);
	
	

}
