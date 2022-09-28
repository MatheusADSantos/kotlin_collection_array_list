package MatheusADSantos.com.github

fun main() {
    // Criando uma instância do banco
    val banco = BancoDeNomes()
    // Criando uma cópia da instância
    val nomesSalvos: Collection<String> = banco.nomes

    // Salvando um nome e printando
    println(banco.nomes)
    println(nomesSalvos)
    banco.salva("Matheus")
    println(banco.nomes)
    println(nomesSalvos)
    println(banco.nomes != nomesSalvos)

}

class BancoDeNomes {

    // Ao usar toList(), estou criando uma cópia 'real' de dados(MutableList) -> nomes(Collection/Imutável),
    // impedindo assim que consiga alterar os valores da lista mutável dados, através de um cast por ex...
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    // Companion object(tornando-a global): para mantes os dados, sem criar nova instancia
    companion object {
        private val dados = mutableListOf<String>()
    }

}

private fun testaColecao() {
    val nomes: Collection<String> = listOf("Matheus", "Fran", "Gui", "Maria", "Ana")
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Matheus? ${nomes.contains("Matheus")}")
    println("Tamanho da coleção ${nomes.size}")
}