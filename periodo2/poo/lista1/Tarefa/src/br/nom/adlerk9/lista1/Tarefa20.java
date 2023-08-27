package br.nom.adlerk9.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarefa20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor informe a quantidade de horas trabalhadas");
		double horas = entrada.nextDouble();
		System.out.print("Por favor informe o valor da hora");
		double valorHora = entrada.nextDouble();
		double salarioBruto = valorHora * horas;
		double ir = 11;	
		double totalDesconto = (salarioBruto*ir/100)+(salarioBruto*8/100)+(salarioBruto*5/100);
		double valorDoIr = salarioBruto*ir/100;
		double valorDoInss =salarioBruto*8/100;
		double valorDosindicato = salarioBruto*5/100;
		double salario = salarioBruto-totalDesconto;
		DecimalFormat de = new DecimalFormat("0");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("+ Salario Bruto: R$"+ df.format(salarioBruto));
		System.out.println("- IR ("+de.format(ir)+"%) : R$ "+df.format(valorDoIr));
		System.out.println("- INSS (8%) : R$ "+ df.format(valorDoInss));
		System.out.println("- Sindicato (5%) : R$ "+df.format(valorDosindicato));
		System.out.println("= Salário Líquido : R$ "+df.format(salario));
	}

}
