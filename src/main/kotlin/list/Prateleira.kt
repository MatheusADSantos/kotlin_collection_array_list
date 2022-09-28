package list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {

    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor } // ordena por autor
    }

    fun organizarPorAnoDePublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao } // ordena por ano de pub
    }

}
