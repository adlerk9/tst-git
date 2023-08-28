package br.com.adlerk9.lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa19L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Double> notas =  new ArrayList<Double>();
		while(true) {
			System.out.print("digite a nota: ");
			double numero = entrada.nextDouble();
			if(numero>=0) {
				notas.add(numero);
			}else {
				break;
			}
		}
		System.out.println("A quantidade de notas e: "+notas.size());
		System.out.println(notas);	
		Collections.reverse(notas);
		System.out.println(notas);
		double soma = somar(notas);
		System.out.println("a soma e: "+soma);
		double media = soma/notas.size();
		System.out.println("a media e: "+media);
		int aMedia = contarMaiorQue(notas,media);
		System.out.println("total de notas acima da media foi: "+aMedia);
		int azarados = menorSet(notas);
		System.out.println("notas abaixo de 7: "+azarados);
	}

	private static int menorSet(List<Double> notas) {
		int saida = 0;
		for (Double d: notas) {
			if(d<7) {
			saida ++;
			}
		}
		return saida;
	}

	private static int contarMaiorQue(List<Double> notas, double media) {
		int saida = 0;
		for (Double d: notas) {
			if (d>media) {
				saida ++;
			}
		}
		return saida;
	}

	private static double somar(List<Double> notas) {
		double saida = 0;
		for (Double d: notas) {
			saida +=d;
		}
		return saida;
	}
}
