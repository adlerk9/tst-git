package br.nom.adler.pet.interfases;

import java.text.ParseException;
import java.util.ArrayList;

import br.nom.adler.pet.model.Cliente;
import br.nom.adler.pet.model.Pet;
import br.nom.adler.pet.model.Procedimento;

public interface IControler {
	public int nextIdProcedimento();
	public int nextIdPet();
	public void salvarProcedimento(IProcedimento record) throws ParseException;
	public int nextIdCliente();
	public void salvarPet(IPet record) throws ParseException;
	public void salvarCliente(ICliente record);
	public ArrayList<Cliente> findAllCliente();
	public ArrayList<Pet> findPet(int idCliente);
	public ArrayList <Procedimento> findProcedimento(int id); 

}
