package MatheusADSantos.com.github

fun main() {

    val nomes: Collection<String> = listOf("Matheus", "Fran", "Gui", "Maria", "Ana")
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Matheus? ${nomes.contains("Matheus")}")
    println("Tamanho da coleção ${nomes.size}")

}