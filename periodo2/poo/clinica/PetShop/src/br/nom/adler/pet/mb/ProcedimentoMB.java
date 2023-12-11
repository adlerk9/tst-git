package br.nom.adler.pet.mb;

import java.text.ParseException;
import java.util.ArrayList;

import br.nom.adler.pet.dao.BaseDAO;
import br.nom.adler.pet.dao.ProcedimentoDAO;
import br.nom.adler.pet.dao.ProcedimentoFindDAO;
import br.nom.adler.pet.interfases.IProcedimento;
import br.nom.adler.pet.model.Procedimento;

public class ProcedimentoMB {
	

	private ProcedimentoDAO dao;
	private ProcedimentoFindDAO find;
	
	public ProcedimentoMB(BaseDAO base) {
		dao = new ProcedimentoDAO(base);
		find = new ProcedimentoFindDAO(base);
	}
	
	
	public int nextId() {
		return dao.nextId();
	}
	
	public void salvarProcedimento(IProcedimento record) throws ParseException {
		dao.salvarProcedimento(record);
	}
	public ArrayList <Procedimento> find (int idPet) {
		return find.find(idPet);
		
	}
}
