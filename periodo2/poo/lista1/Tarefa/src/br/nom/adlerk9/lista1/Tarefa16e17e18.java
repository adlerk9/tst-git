package br.nom.adlerk9.lista1;

public class Tarefa16e17e18 {

	public static void main(String[] args) {
		int variavel = 105;
		int [] test = {3,5,7};
		for (int n: test) {
			System.out.print("o numero "+variavel);
			if (variavel %n > 0) {
				System.out.print(" não ");	
			}
			System.out.println(" é divisível por "+n);
		}
	}

}
