package br.nom.adler.pet.dao;

import java.util.ArrayList;

import br.nom.adler.pet.model.Pet;

public class PetFindDAO {
	
private	ArrayList<Pet> lista;
	
	public PetFindDAO(BaseDAO base) {
		this.lista = base.getListaPets();
	}
	public ArrayList<Pet> find(int idCliente) {
		ArrayList<Pet> saida = new ArrayList<Pet>();
		for (Pet item : lista) {
			if(item.getIdTutor() == idCliente) {
				saida.add(item);
			}
		}
		return saida;
	}


}
