package br.com.adlerk9.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarefa7L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor,informe seu salario");
		double salario = entrada.nextDouble();
		double porcento = 5;
		if(salario <= 280) {
			porcento = 20;
		}else		if(salario <=700 ) {
			porcento = 15;
		}else		if(salario <=1500 ) {
			porcento = 10;
		}
		double aumento =salario  *  porcento/100;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O salario era R$ "+df.format(salario));
		System.out.println("O percentual de aumetno foi de: "+porcento + "%");
		System.out.println("O valor de aumeto foi de R$ "+df.format(aumento));
		System.out.println("O novo salario e R$ "+df.format(salario + aumento));
}
}