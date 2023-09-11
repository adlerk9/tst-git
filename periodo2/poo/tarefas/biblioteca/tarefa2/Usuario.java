package br.com.adlerk9.tarefa2;

public class Usuario {
	public String nome;
	public	 int id;
	public String email;
	public Livro[] livros = new Livro[5]; 
	
	public void exibirInfo() {
		System.out.println("Nome do usuario e: "+nome);
		System.out.println("ID do usuario: "+id);
		System.out.println("O E-mail e: "+email);
		System.out.println("Livros em posse: ");
		int quant = 0;
		for (Livro livro: livros) {
			if(livro != null) {
				quant++;
				System.out.println("\t"+quant+": "+livro.titulo);
			}
		}
		System.out.println("Total de livros em posse "+quant);
		System.out.println();
	}
}
