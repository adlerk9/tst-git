package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa1L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro numero:");
		int numero1 = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("digite o numero:");
		int numero2 = entrada1.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("o numero maior é "+numero1);
		}else {
			System.out.println("o numero maior é  "+numero2);
		}
	}

}
