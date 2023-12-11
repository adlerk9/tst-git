package br.nom.adler.pet.form;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseForm extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	protected  int largura;
	protected  int altura;
	protected  int x = 10;
	protected  int y = 10;
	protected  JDesktopPane desktop;

	public BaseForm(String titulo, int px, int py ,int largura,int altura) {
		super (titulo);
		setBounds(px, py, largura, altura); 
		this.largura = largura;
		this.altura = altura;

		desktop = new JDesktopPane();
		add(desktop);
		


	}

	private void testaEspaco(int largura) {
		if (x + largura + 10 >= this.largura) {
			proximaLinha();
		}
	}

	public void proximaLinha() {
		x = 10;
		y = y + 55;
	}

	protected JTextField montarTexto(String titulo, int largura) {
		testaEspaco(largura);	

		JLabel label1 = new JLabel();

		label1.setBounds(x, y, largura, 20);
		label1.setText(titulo);
		desktop.add(label1);

		JTextField edit = new JTextField();
		edit.setBounds(x, y + 20, largura, 30);
		desktop.add(edit);
		x = x + largura + 5;		
		return edit;

	}

	protected JButton montarBotao(String titulo, int largura) {
		testaEspaco(largura);	
		JButton btn = new JButton();
		btn.setText(titulo);
		btn.setBounds(x, y + 20, largura, 30);
		desktop.add(btn);
		x = x + largura + 5;		
		return btn;
	}
	protected JTextArea montarTextoArea(String titulo, int largura, int altura) {
		if (x >5) {
			proximaLinha();
		}
		JLabel label1 = new JLabel();
		label1.setBounds(x, y, largura, 20);
		label1.setText(titulo);
		desktop.add(label1);

		JTextArea edit = new JTextArea();
		JScrollPane scroll = new JScrollPane(edit);
		scroll.setBounds(5, y + 20, largura, altura);
		desktop.add(scroll);
		x = 5;
		y = y + 20 + altura;
		return edit;
	}

}
