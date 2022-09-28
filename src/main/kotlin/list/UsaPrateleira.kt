package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = livros)
    val porAutor = prateleira.organizarPorAutor()
    val porAnoDePublicacao = prateleira.organizarPorAnoDePublicacao()

    // Agora imprimirá dois objetos diferentes, por ser um List, não é mutável, cria-se novas instancias de objetos
    porAutor.imprimiListaComMarcadores()
    print("------")
    porAnoDePublicacao.imprimiListaComMarcadores()
}