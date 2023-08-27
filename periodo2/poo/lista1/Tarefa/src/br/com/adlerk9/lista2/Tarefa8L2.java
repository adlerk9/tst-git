package br.com.adlerk9.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarefa8L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor informe a quantidade de horas trabalhadas");
		double horas = entrada.nextDouble();
		System.out.println("Por favor informe o valor da hora");
		double valorHora = entrada.nextDouble();
		double salarioBruto = valorHora * horas;
		double ir = 0.00;	
		if(salarioBruto > 2500) {
			ir = 20;
		}else 	if(salarioBruto>1500) {
			ir = 10;
		}else 	if(salarioBruto>900) {
			ir = 5;
		}
		double totalDesconto = (salarioBruto*ir/100)+(salarioBruto*10/100);
		double valorDoIr = salarioBruto*ir/100;
		double valorDoInss =salarioBruto*10/100;
		double valorDoFgts = salarioBruto*11/100;
		double salario = salarioBruto-totalDesconto;
		DecimalFormat de = new DecimalFormat("0");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Salario Bruto:("+de.format(horas)+"*"+de.format(valorHora)+")\t: R$ "+df.format(salarioBruto));
		System.out.println("(-)IR ("+de.format(ir)+"%)"+"\t			: R$ "+df.format(valorDoIr));
		System.out.println("(-)INSS(10%)"+" \t		: R$ "+ df.format(valorDoInss));
		System.out.println("FGTS(11%)"+ " \t 		: R$ "+ df.format(valorDoFgts));
		System.out.println("Total de descontos"+" \t 	: R$ "+df.format(totalDesconto));
		System.out.println("Salário Líquido"+" \t	: R$ "+df.format(salario));
	}
}
