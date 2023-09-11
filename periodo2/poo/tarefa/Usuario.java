package br.com.adlerk9.tarefa2;

public class Usuario {

	private static int contId = 0;
	
	public String nome;
	public	 int id = ++ contId;
	public String email;
	public Livro[] livros = new Livro[5]; 
	
	public void exibirInfo() {
		System.out.println("Nome do usuario e: "+nome);
		System.out.println("ID do usuario: "+id);
		System.out.println("O E-mail e: "+email);
		System.out.println("Livros em posse: ");
		int quant = 0;
		for (int i =0; i<livros.length;i++) {
			Livro livro =livros[i];
			if(livro != null) {
				quant++;
				System.out.println("\t"+quant+": "+livro.titulo);
			}
		}
		System.out.println("Total de livros em posse "+quant);
		System.out.println();
	}
}
