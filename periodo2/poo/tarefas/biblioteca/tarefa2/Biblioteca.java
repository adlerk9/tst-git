package br.com.adlerk9.tarefa2;

public class Biblioteca {
	public String nome;
	public String endereco;
	public Livro[] livros = new Livro[100];
	
	public boolean verificarDisponbilidade(){
		for(Livro livro: livros) {
			if(livro != null && livro.quantidade>0) {
				return true;
			}
		}
		return false;	
	}
	
	public void cadastrarLivro(String titulo, String isbn, int anoPublicacao, String autor, int quantidade){
		Livro livro = new Livro();
		livro.titulo = titulo;
		livro.anoPublicacao=anoPublicacao;
		livro.autor=autor;
		livro.isbn=isbn;
		livro.quantidade=quantidade;
		for(int i = 0; i<livros.length;i++) {
			if(livros[i]==null) {
				livros[i]=livro;
				return;
			}
		}
		System.err.println("ERRO! Não houve espaço");
	}

	public Livro localizarLivroPorAutor(String busca) {
		for(Livro item: livros) {
			if(item != null && item.autor.equalsIgnoreCase(busca)) {
				return item;
			}
		}
		return null;
	}

	public void emprestar(Livro livro, Usuario usuario) {
		if(livro.quantidade<1) {
			System.err.println("Livro indisponivel");
			return;
		}
		for(int i =0; i<usuario.livros.length;i++) {
			if(usuario.livros[i]==null) {
				usuario.livros[i] = livro;
				livro.quantidade--;
				System.out.println("Livro adicionado com sucesso");
				return;
			}
		}
		System.err.println("Quantidade de livros foi ultrapassada");
	}
	
	public void devolver(Livro livro, Usuario usuario) {
		for(int i =0; i<usuario.livros.length;i++) {
			if(usuario.livros[i]==livro) {
				usuario.livros[i] = null;
				livro.quantidade++;
				System.out.println("Livro delvolvido com sucesso");
				return;
			}
		}
		System.err.println("Livro não localizado");
	}

	
}
