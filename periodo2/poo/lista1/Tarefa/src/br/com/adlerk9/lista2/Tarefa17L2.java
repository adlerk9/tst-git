package br.com.adlerk9.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarefa17L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double valorTotal = 0;
		int quantidadePagamentos = 0;
		while(true) {
			System.out.print("Digite o valor da prestação: ");
			double valor = entrada.nextDouble();
			if (valor ==0) {
				break;
			}
			System.out.print("Digite o numeros de dias em atraso: ");
			double dias = entrada.nextDouble();
			double valorPago = calculaValor(valor, dias);
			System.out.println("O valor da prestação e: R$"+df.format(valorPago));
			valorTotal += valorPago;
			quantidadePagamentos++;
		}
		System.out.println("Foram pagas "+quantidadePagamentos+" prestações.");
		System.out.println("Valor total foi de R$ "+df.format(valorTotal));
		System.out.println("Progama encerrado");
	}
	
	private static double calculaValor(double valor, double dias) {
		if(dias == 0) {
			return valor;
		}else {
			return valor+(valor*3/100)+(valor*(dias*1/100));
		}
	}

}
