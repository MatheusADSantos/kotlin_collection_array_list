fun forEachIndexed() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 10000.0)
    val aumento = 1.1 // Aumento de 10%


    // Nesse laço teremos o iterável(salario)
    var cont = 0
    for (salario in salarios) {
        salarios[cont] = salario * aumento
        cont++
    }
    println(salarios.contentToString())


    // Nesse laço teremos o índice(indice)
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    // Nesse laço temos tanto o iterável, quanto o indice, tendo o melhor dos mundos...
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }
    println(salarios.contentToString())


    // Tipos de instancia de arrays
    val contatos = arrayOf("", "")
    val contatos2: Array<String> = Array<String>(3) {""}

//    https://www.alura.com.br/artigos/arredondamento-no-java-do-double-ao-bigdecimal
}