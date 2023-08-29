package br.com.adlerk9.Tarefa;

public class Casa {
	
	private int numeroDCasa;
	private double tamanhoDTerreno;
	private String nomeDRua;
		
	public Casa(int numeroDCasa, double tamanhoDTerreno, String nomeDRua) {
		this.numeroDCasa = numeroDCasa;
		this.tamanhoDTerreno = tamanhoDTerreno;
		this.nomeDRua = nomeDRua;
		System.out.println("primeiro contrutor");
	}

	public Casa(Casa modelo) {
		this.numeroDCasa = modelo.numeroDCasa;
		this.nomeDRua = "copia de "+ modelo.nomeDRua;
		this.tamanhoDTerreno = modelo.tamanhoDTerreno;
	}
		
	public int getNumeroDCasa() {
		return numeroDCasa;
	}
	public void setNumeroDCasa(int numeroDCasa) {
		this.numeroDCasa = numeroDCasa;
	}
	public double getTamanhoDTerreno() {
		return tamanhoDTerreno;
	}
	public void setTamanhoDTerreno(double tamanhoDTerreno) {
		this.tamanhoDTerreno = tamanhoDTerreno;
	}
	public String getNomeDRua() {
		return nomeDRua;
	}
	public void setNomeDRua(String nomeDRua) {
		this.nomeDRua = nomeDRua;
	}
	
}
