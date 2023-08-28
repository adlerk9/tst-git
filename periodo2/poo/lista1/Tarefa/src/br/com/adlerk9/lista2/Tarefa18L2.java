package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa18L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite 1 - sim ou 0 - não");
		System.out.print("Mora perto da vitima?");
		int resposta = entrada.nextInt();
		System.out.print("Já trabalhou com a vitima?");
		int resposta1 = entrada.nextInt();
		System.out.print("Esteve no local do crime?");
		int resposta2 = entrada.nextInt();
		System.out.print("Telefonou para a vitima?");
		int resposta3 = entrada.nextInt();
		System.out.print("Devia para a vitima?");
		int resposta4 = entrada.nextInt();
		int resultado = resposta + resposta1 + resposta2 + resposta3 + resposta4;
		if(resultado == 5) {
			System.out.println("Voce e o culpado");
		}else if(resultado>=3) {
			System.out.println("Voce e um cumplece");
		}else if(resultado==2) {
			System.out.println("Voce e suspeito");
		}else {
			System.out.println("Voce e inocente");
		}
	}

}
