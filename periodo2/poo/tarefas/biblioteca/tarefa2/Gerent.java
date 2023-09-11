package br.com.adlerk9.tarefa2;

public class  Gerent {
	
	public static void main(String[] args) {
		Biblioteca biblioteca=new Biblioteca();
		biblioteca.endereco ="-272, R. Padre Rolim, 220 - Centro, Cajazeiras - PB, 58900-000";
		biblioteca.nome ="Biblioteca Pública Municipal";
		biblioteca.cadastrarLivro("A Batalha Da Torre", "978-85-8543-398-7", 2016,"Marcos Túlio" , 2);
		biblioteca.cadastrarLivro("Hell-raiser", "198-176-234-32-3", 2015,"Hell" , 6);
		String busca="Hell";
		Livro livro=biblioteca.localizarLivroPorAutor(busca);
		Usuario usuario = new Usuario();
		usuario.nome = "Meliodas";
		usuario.email = "meliodas.gamesplai@email.com";
		usuario.id = 1;
		busca="Marcos Túlio";
		biblioteca.emprestar(livro, usuario);
		livro=biblioteca.localizarLivroPorAutor(busca);
		biblioteca.emprestar(livro, usuario);
		biblioteca.emprestar(livro, usuario);
		usuario.exibirInfo();
		biblioteca.devolver(livro,usuario);
		usuario.exibirInfo();
		
	}
	
	public static void main02(String[] args) {
		Biblioteca biblioteca=new Biblioteca();
		biblioteca.endereco ="-272, R. Padre Rolim, 220 - Centro, Cajazeiras - PB, 58900-000";
		biblioteca.nome ="Biblioteca Pública Municipal";
		biblioteca.cadastrarLivro("A Batalha Da Torre", "978-85-8543-398-7", 2016,"Marcos Túlio" , 2);
		biblioteca.cadastrarLivro("Hell-raiser", "198-176-234-32-3", 2015,"Hell" , 1);
		String busca="Hell";
		Livro livro=biblioteca.localizarLivroPorAutor(busca);
		if(livro==null) {
			System.err.println("Livro não encontrado");
		}else {
			livro.exibirInfo();
		}
	}
	public static void main01(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Meliodas";
		u1.email = "meliodas.gamesplai@email.com";
		u1.id = 1;
		u1.exibirInfo();
		Livro l1 = new Livro();
		l1.titulo = "A Batalha Da Torre";
		l1.autor = "Marcos Túlio";
		l1.anoPublicacao = 2016;
		l1.isbn = "978-85-8543-398-7";
		l1.quantidade = 2;
		l1.exibirInfo();
		u1.livros[0]=l1;
		u1.exibirInfo();
	}

}
