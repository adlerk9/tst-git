package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa3L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a primeira nota:");
		double numero1 = entrada.nextDouble();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("digite a segundo nota:");
		double numero2 = entrada1.nextDouble();
		double media = (numero1 + numero2)/2;
		if(media == 10) {
			System.out.println("Aprovado com Distinção com a media de "+media);
		}else 	if(media >= 7 ) {
			System.out.println("Aprovado com a media de "+media);
		}else {
			System.out.println("Reprovado com a media de "+media);
		}

	}

}
