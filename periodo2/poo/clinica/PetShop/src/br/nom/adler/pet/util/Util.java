package br.nom.adler.pet.util;

import javax.swing.JOptionPane;

public class Util {
	
	public static String longToStr(long value) {
		String valor = Long.toString(value);
		if (valor.length() < 3) {
			valor = "000".substring(valor.length()) + valor;
		}
		return "R$ " + valor.substring(0, valor.length() -2) + "," + valor.substring(valor.length() - 2);
	}
	public static long strToLong(String valor) {
		valor = valor.replaceAll("[^0-9,]", "");
		if (valor.indexOf(",") < 0) {
			valor = valor + "00";
		} else if (valor.indexOf(",") == valor.length() - 2) {
				valor = valor + "0";
		}
		valor = valor.replaceAll("[^0-9]", "");
		return Long.parseLong(valor);
	
	}
	public static void mensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);		
	}
}
