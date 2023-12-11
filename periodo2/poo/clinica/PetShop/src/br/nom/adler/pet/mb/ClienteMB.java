package br.nom.adler.pet.mb;

import java.util.ArrayList;

import br.nom.adler.pet.dao.BaseDAO;
import br.nom.adler.pet.dao.ClienteDAO;
import br.nom.adler.pet.dao.ClienteFindDAO;
import br.nom.adler.pet.interfases.ICliente;
import br.nom.adler.pet.model.Cliente;

public class ClienteMB {

	private ClienteDAO dao;
	private ClienteFindDAO find;
	
	public ClienteMB(BaseDAO base) {
		dao = new ClienteDAO(base);
		find = new ClienteFindDAO(base);
	}
	
	public void salvarCliente(ICliente record) {
		dao.salvarCliente(record);
	}

	public int nextId() {
		return dao.nextId();
	}

	public ArrayList<Cliente> findAll() {
		return find.findAll();
	}
}
