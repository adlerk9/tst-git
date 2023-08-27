package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa2L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o numero:");
		int numero1 = entrada.nextInt();
		
		if(numero1 > 0) {
			System.out.println("esse numero e positivo "+numero1);
		}else {
			System.out.println("esse numero e negativo "+numero1);
		}

	}

}
