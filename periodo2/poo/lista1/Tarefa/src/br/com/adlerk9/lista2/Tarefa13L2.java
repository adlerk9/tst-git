package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa13L2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um numero para a repeticao");
		int numero = entrada.nextInt();
		double soma = 1;
		for (int i = 2; i <= numero; i ++) {
			double razao = 1d/(double)i;
			soma += razao;
			System.out.println("para "+i+" temos razao = "+razao+ " h = "+soma);	
		}

	}

}
