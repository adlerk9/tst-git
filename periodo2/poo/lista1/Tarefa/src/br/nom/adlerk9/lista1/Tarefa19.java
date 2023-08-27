package br.nom.adlerk9.lista1;

import java.util.Scanner;

public class Tarefa19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro numero:");
		double numero1 = entrada.nextDouble();
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("digite o segundo numero:");
		double numero2 = entrada1.nextDouble();
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("digite o terceiro numero:");
		double numero3 = entrada2.nextDouble();
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("digite o quarto numero:");
		double numero4 = entrada3.nextDouble();
		System.out.println((numero1 + numero2 + numero3 +numero4)/4);
		
	}

}
