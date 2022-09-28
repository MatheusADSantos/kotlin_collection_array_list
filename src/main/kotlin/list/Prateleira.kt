package list

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {

    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor } // ordena por autor
        return livros
    }

    fun organizarPorAnoDePublicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao } // ordena por ano de pub
        return livros
    }

}
