package br.com.adlerk9.lista2;

public class Tarefa5L {

	public static void main(String[] args) {
		int numero1 = 17;
		int numero2 = 16;
		int numero3 = 10;
		if(numero1 > numero2) {
			int tmp = numero2;
			numero2 = numero1;
			numero1 = tmp;
		}
		if(numero2 > numero3) {
			int tmp = numero3;
			numero3 = numero2;
			numero2 = tmp;
		}else if(numero3 < numero1) {
			int tmp = numero3;
			numero3 = numero1;
			numero1 = tmp;
		}
		if(numero1 > numero2) {
			int tmp = numero2;
			numero2 = numero1;
			numero1 = tmp;
		}
		System.out.println("o menor numero "+numero1 +" \r\no maior numero e "+numero3);
	}
}