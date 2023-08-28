package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa14L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro numero");
		int numero = entrada.nextInt();
		for (int i = 1;i <= numero;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
