package br.nom.adler.pet.interfases;

import java.text.ParseException;
import java.util.Date;

public interface IPet {
	
	public int getId();
	public void setId(int id);
	public String getNome();
	public void setNome(String nome);
	public String getEspecie();
	public void setEspecie(String especie);
	public float getPeso();
	public void setPeso(float peso);
	public Date getNascimento() throws ParseException;
	public void setNascimento(Date nascimento);
	public int getIdTutor();
	public void setIdTutor(int idTutor);

}
