package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa16L2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro numero");
		int numero1 = entrada.nextInt();
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("digite o segundo numero");
		int numero2 = entrada1.nextInt();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("digite o terceito numero");
		int numero3 = entrada2.nextInt();
		int soma = numero1+numero3+numero2;
		System.out.print(soma);
	}

}
