package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = livros)
    val porAutor = prateleira.organizarPorAutor()
    val porAnoDePublicacao = prateleira.organizarPorAnoDePublicacao()

    // Vai imprimir duas listas iguais, pois ambos(porAutor e porAno...) estão apontando para o mesmo objeto ...
    // Sendo assim, retornando uma lista ordenada por ano de pub
    porAutor.imprimiListaComMarcadores()
    print("------")
    porAnoDePublicacao.imprimiListaComMarcadores()
}