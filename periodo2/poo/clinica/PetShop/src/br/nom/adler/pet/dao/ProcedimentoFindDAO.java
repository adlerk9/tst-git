package br.nom.adler.pet.dao;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import br.nom.adler.pet.model.Procedimento;

public class ProcedimentoFindDAO {
private	ArrayList<Procedimento> lista;
	
	public ProcedimentoFindDAO(BaseDAO base) {
		this.lista = base.getListaProcedimentos();
	}
	public ArrayList<Procedimento> find(int idPet) {
		ArrayList<Procedimento> saida = new ArrayList<Procedimento>();
		for (Procedimento item : lista) {
			if(item.getIdPet()== idPet) {
				saida.add(item);
			}
		}
		return saida;
	}


}
