package br.nom.adler.pet.dao;

import java.util.ArrayList;
import br.nom.adler.pet.model.*;

public class BaseDAO {
	
	private	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private	ArrayList<Pet> listaPets = new ArrayList<Pet>();
	private	ArrayList<Procedimento> listaProcedimentos = new ArrayList<Procedimento>();
	
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public ArrayList<Pet> getListaPets() {
		return listaPets;
	}
	public ArrayList<Procedimento> getListaProcedimentos() {
		return listaProcedimentos;
	}

}
