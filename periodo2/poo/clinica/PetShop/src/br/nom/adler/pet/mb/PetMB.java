package br.nom.adler.pet.mb;

import java.text.ParseException;
import java.util.ArrayList;

import br.nom.adler.pet.dao.BaseDAO;
import br.nom.adler.pet.dao.PetDAO;
import br.nom.adler.pet.dao.PetFindDAO;
import br.nom.adler.pet.interfases.IPet;
import br.nom.adler.pet.model.Pet;

public class PetMB {
	
	private PetDAO dao;
	private PetFindDAO find;

	public PetMB(BaseDAO base) {
		dao = new PetDAO(base);
		find = new PetFindDAO(base);
	}
	public int nextId() {
		return dao.nextId();
	}
	public void salvarPet(IPet record) throws ParseException {
		dao.salvarPet(record);
	}
	public ArrayList<Pet> find(int idCliente) {
		return find.find(idCliente);
	}
}
