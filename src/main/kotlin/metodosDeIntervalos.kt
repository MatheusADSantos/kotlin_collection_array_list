fun metodosDeIntervalos() {

    val idades: IntArray = intArrayOf(99, 12, 18, 33, 40, 67)

    val maiorIdade: Int = idades.max()
    val menorIdade: Int = idades.min()
    val media: Double = idades.average()
    val todosMaiorIdade: Boolean = idades.all { it >= 18 } // Retorna um true se atender a condição
    val algumMaiorIdade: Boolean = idades.any { it >= 18 }
    val maioresDe18: List<Int> = idades.filter { it >= 18 } // Retorna uma lista com os maiores de 18
    val buscaMaiorIgual18 = idades.find { it >= 18 } // Retorna o primeiro valor que atende a condição

    println("maiorIdade: $maiorIdade")
    println("menorIdade: $menorIdade")
    println("media: $media")
    println("todosMaiorIdade: $todosMaiorIdade")
    println("algumMaiorIdade: $algumMaiorIdade")
    println("maioresDe18: $maioresDe18")
    println("buscaMaiorIgual18: $buscaMaiorIgual18")

}