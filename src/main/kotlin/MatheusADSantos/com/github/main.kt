package MatheusADSantos.com.github

fun main() {
    // Criando uma instância do banco
    val banco = BancoDeNomes()

    // Salvando um nome e printando
    println(banco.nomes)
    banco.salva("Matheus")
    println(banco.nomes)
    println("Aqui garanto que ambas as instancias estão pegando do mesmo banco: ${ banco.nomes == BancoDeNomes().nomes }")

}

class BancoDeNomes {

    // Coleção(nomes) imutável publica, recebendo uma shadow copy(cópia básica),
    // ou seja, apontando para a mesma referência
    val nomes: Collection<String> get() = dados

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