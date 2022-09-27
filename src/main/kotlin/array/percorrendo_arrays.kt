fun percorrendo_arrays() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

//    for in: Método de laço para percorrer um array
    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

//    forEach(): Aqui estamos usando outro método de laço
    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)

}