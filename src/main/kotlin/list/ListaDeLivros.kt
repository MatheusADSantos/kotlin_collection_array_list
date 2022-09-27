package list

fun main() {

    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    // Criando uma lista do tipo MutableList<Livro>
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    // Adicionando mais um livro a lista
    val meuLivro = Livro(titulo = "Sagarana", autor = "João Guimarães Rosa", anoPublicacao = 1946)
    livros.add(meuLivro)

    // Removendo um livro da lista
    livros.remove(livro3)

    livros.imprimiListaComMarcadores()

    livros.sorted() // Pra conseguirmos chamar o sorted() precisou implementar a int. Comparable<T>
    livros.imprimiListaComMarcadores()

    livros.sortedBy { it.anoPublicacao }

    val titulos = livros.titulosPorAnoPublicacaoDoAutor("J")
    println(titulos)
}

fun MutableList<Livro>.imprimiListaComMarcadores() {
    val listaComMarcadores = this.joinToString(separator = "\n") {
        "-> ${it.titulo} de ${it.autor}"
    }
    println("\n ### Lista de Livros ### \n${listaComMarcadores}")
}

fun MutableList<Livro>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String): List<String> {
    return this
        .filter { it.autor.startsWith(prefixoAutor) }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
}