package br.nom.adler.pet.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.nom.adler.pet.interfases.IProcedimento;
import br.nom.adler.pet.interfases.IProcedimento;
import br.nom.adler.pet.model.Procedimento;
import br.nom.adler.pet.model.Procedimento;

public class ProcedimentoDAO {
	
	private	ArrayList<Procedimento> lista;
	
	public ProcedimentoDAO(BaseDAO base) {
		this.lista = base.getListaProcedimentos();
	}
	public int nextId() {
		int i = lista.size()+1;
		lista.add(new Procedimento());
		return i;
	}
	public void salvarProcedimento(IProcedimento record) throws ParseException {
		int id = record.getId();
		for(Procedimento item:lista) {
			if(item.getId()== id) {
				item.setDados(record);
				return;
			}
		}
		lista.add(new Procedimento(record));
	}
}
