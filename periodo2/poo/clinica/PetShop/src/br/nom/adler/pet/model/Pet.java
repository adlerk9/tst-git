package br.nom.adler.pet.model;

import java.text.ParseException;
import java.util.Date;

import br.nom.adler.pet.interfases.IPet;

public class Pet implements IPet{
	private int id;
	private String nome;
	private String especie;
	private float peso;
	private Date nascimento;
	private int idTutor;

	public Pet () {

	}

	public Pet(IPet modelo)throws ParseException  {
		setDados(modelo);
		
	}
	public void setDados(IPet modelo)throws ParseException {
		id = modelo.getId();
		nome = modelo.getNome();
		especie = modelo.getEspecie();
		peso = modelo.getPeso();
		nascimento = modelo.getNascimento();
		idTutor = modelo.getIdTutor();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdTutor() {
		return idTutor;
	}
	public void setIdTutor(int idTutor) {
		this.idTutor = idTutor;
	}
	@Override
	public String toString() {
		return nome+" - "+especie;
	}


}
