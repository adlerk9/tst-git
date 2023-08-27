package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa11L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero e saiba sua tabuada");
		int numero = entrada.nextInt();
		int [] tabela = {4,5,6,7};
		for (int num: tabela) {
			System.out.println(numero + " X "+ num + " = "+numero * num);
	}
	}
}
