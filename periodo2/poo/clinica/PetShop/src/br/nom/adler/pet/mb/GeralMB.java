package br.nom.adler.pet.mb;

import java.text.ParseException;
import java.util.ArrayList;

import br.nom.adler.pet.dao.BaseDAO;
import br.nom.adler.pet.interfases.ICliente;
import br.nom.adler.pet.interfases.IControler;
import br.nom.adler.pet.interfases.IPet;
import br.nom.adler.pet.interfases.IProcedimento;
import br.nom.adler.pet.model.Cliente;
import br.nom.adler.pet.model.Pet;
import br.nom.adler.pet.model.Procedimento;

public class GeralMB implements IControler{
	
	private ProcedimentoMB procedimentoMB;
	private PetMB petMB;
	private ClienteMB clienteMB;
	
	public GeralMB(BaseDAO base) {
		clienteMB=new ClienteMB(base);
		petMB = new PetMB(base);
		procedimentoMB = new ProcedimentoMB(base);
	}
	
	public int nextIdProcedimento() {
		return procedimentoMB.nextId();
	}
	public int nextIdPet() {
		return petMB.nextId();
	}
	public int nextIdCliente() {
		return clienteMB.nextId();
	}

	
	public void salvarPet(IPet record) throws ParseException {
		petMB.salvarPet(record);
		
	}
	public void salvarCliente(ICliente record) {
		clienteMB.salvarCliente(record);
		
	}
	public void salvarProcedimento(IProcedimento record) throws ParseException {
		procedimentoMB.salvarProcedimento(record);
		
	}
	public ArrayList<Cliente> findAllCliente() {
		return clienteMB.findAll(); 
	}

	public ArrayList<Pet> findPet(int idCliente){
		return petMB.find(idCliente);
	}
	public ArrayList <Procedimento> findProcedimento(int idPet) {
		return procedimentoMB.find(idPet);
	}
}
