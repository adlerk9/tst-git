package br.com.adlerk9.tarefa2;

public class Livro{
	
	public String titulo;
	public String autor;
	public String isbn;
	public int anoPublicacao;
	public int quantidade;
	
	public void exibirInfo() {
		System.out.println("O livro: "+titulo);
		System.out.println("O autor e: "+autor);
		System.out.println("O ISBN e: "+isbn);
		System.out.println("O ano de publicação e: "+anoPublicacao);
		System.out.println("Tem "+quantidade+" no estoque\r\n");	
		
	}
	
}
