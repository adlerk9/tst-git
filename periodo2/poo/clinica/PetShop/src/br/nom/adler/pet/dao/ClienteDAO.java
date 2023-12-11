package br.nom.adler.pet.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.nom.adler.pet.interfases.ICliente;
import br.nom.adler.pet.model.Cliente;


public class ClienteDAO {
	
	private	ArrayList<Cliente> lista;
	
	public ClienteDAO(BaseDAO base) {
		this.lista = base.getListaClientes();
	}
	public int nextId() {
		int i = lista.size()+1;
		lista.add(new Cliente());
		return i;
	}
	public void salvarCliente(ICliente record) {
		int id = record.getId();
		for(Cliente item:lista) {
			if(item.getId()== id) {
				item.setDados(record);
				return;
			}
		}
		lista.add(new Cliente(record));
	}
}
