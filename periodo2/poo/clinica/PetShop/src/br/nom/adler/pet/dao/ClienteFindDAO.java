package br.nom.adler.pet.dao;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import br.nom.adler.pet.model.Cliente;

public class ClienteFindDAO {

	private	ArrayList<Cliente> lista;
	
	public ClienteFindDAO(BaseDAO base) {
		this.lista = base.getListaClientes();
	}
	public ArrayList<Cliente> findAll() {
		ArrayList<Cliente> saida = new ArrayList<Cliente>();
		for (Cliente item : lista) {
			if(item.getNome() != null && !item.getNome().trim().equals("")) {
				saida.add(item);
			}
		}
		return saida;
	}


}
