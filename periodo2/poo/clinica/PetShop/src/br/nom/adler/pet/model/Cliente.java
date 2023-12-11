package br.nom.adler.pet.model;

import br.nom.adler.pet.interfases.ICliente;

public class Cliente {
	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	private String redeSocial;
	
	public Cliente () {
		
	}
	public Cliente(ICliente modelo) {
		setDados(modelo);
	}
	
	public void setDados(ICliente modelo) {
		id = modelo.getId();
		nome = modelo.getNome();
		telefone = modelo.getTelefone();
		endereco = modelo.getEndereco();
		redeSocial = modelo.getRedeSocial();
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRedeSocial() {
		return redeSocial;
	}
	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
