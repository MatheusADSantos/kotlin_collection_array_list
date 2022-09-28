package list

fun MutableList<Livro?>.imprimiListaComMarcadores() {
    val listaComMarcadores: String = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "-> ${it?.titulo} de ${it?.autor}"
        }
    println("\n ### Lista de Livros ### \n${listaComMarcadores}")
}

fun MutableList<Livro>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String): List<String> {
    return this
        .filter { it.autor.startsWith(prefixoAutor) }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
}