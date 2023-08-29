package br.com.adlerk9.Tarefa;

public class Rotacionar {

	public static void main(String[] args) {
		Casa macao = new Casa(171, 25 * 5, "facinate");
		Casa marcao = new Casa(macao);
		
		System.out.println(macao.getNomeDRua());
		System.out.println(marcao.getNomeDRua());
	}

}
