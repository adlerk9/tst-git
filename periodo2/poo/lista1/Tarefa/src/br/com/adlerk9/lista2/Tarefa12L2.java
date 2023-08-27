package br.com.adlerk9.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa12L2 {

	public static void main(String[] args) {
		Scanner nome1 = new Scanner(System.in);
		System.out.print("Por favor digite seu nome");
		String nome = nome1.next();
		Scanner entrada = new Scanner(System.in);
		System.out.print("primeiro salto em metros foi de :");
		double salto1 = entrada.nextDouble();
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Segundo salto em metros foi de :");
		double salto2 = entrada1.nextDouble();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Terceiro salto em metros foi de :");
		double salto3 = entrada2.nextDouble();
		Scanner entrada3 = new Scanner(System.in);
		System.out.print("Quarto salto em metros foi de :");
		double salto4 = entrada3.nextDouble();
		Scanner entrada4 = new Scanner(System.in);
		System.out.print("Quinto salto em metros foi de :");
		double salto5 = entrada4.nextDouble();
		double media = (salto1+salto2+salto3+salto4+salto5)/5;
		double[] saltos = {salto1,salto2,salto3,salto4,salto5};
		Arrays.sort(saltos);
		System.out.println("atleta: "+nome);
		System.out.println("");
		System.out.println("Primeiro salto: "+salto1+" m");
		System.out.println("Segundo salto: "+salto2+" m");
		System.out.println("Terceiro salto: "+salto3+" m");
		System.out.println("Quarto salto: "+salto4+" m");
		System.out.println("Quinto salto: "+salto5+" m");
		System.out.println("");
		System.out.println("Melhor salto: "+saltos[4]+" m");
		System.out.println("o pior salto "+saltos[0]+" m");
		System.out.println("Média dos demais saltos: "+media+" m");
		System.out.println("");
		System.out.println("Resultado:");
		System.out.println(nome+": "+media+" m");
	}

}
