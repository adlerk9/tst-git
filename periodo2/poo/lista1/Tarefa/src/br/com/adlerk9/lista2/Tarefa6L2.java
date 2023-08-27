package br.com.adlerk9.lista2;

import java.util.Scanner;

public class Tarefa6L2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o turno que voce estuda M-matutino ou V-vespertino e N-norturno:");
		String turno = entrada.next();
		String m = "M";
		String n = "N";
		String t = "V";

		if (turno.equalsIgnoreCase(m)) {
			System.out.println("Bom dia");
		}else if (turno.equalsIgnoreCase(n)) {
			System.out.println("Boa noite");
		}else if(turno.equalsIgnoreCase(t)) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Opção não valida");
		}
	}

}
