package br.nom.adler.pet.dao;

import java.text.ParseException;
import java.util.ArrayList;

import br.nom.adler.pet.interfases.IPet;
import br.nom.adler.pet.model.Pet;

public class PetDAO {
	
	private	ArrayList<Pet> lista;
	
	public PetDAO(BaseDAO base) {
		this.lista = base.getListaPets();
	}
	public int nextId() {
		int i = lista.size()+1;
		lista.add(new Pet());
		return i;
	}
	public void salvarPet(IPet record) throws ParseException {
		int id = record.getId();
		for(Pet item:lista) {
			if(item.getId()== id) {
				item.setDados(record);
				return;
			}
		}
		lista.add(new Pet(record));
	}
}