fun ranges() {
    //Criando um range progressivo com 'rangeTo'
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        println(s)
    }
    println()


    // Ao invés de usarmos o 'rangeTo' vamos usar '..'
    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        println(numeroPar)
    }
    println()


    // Agora quero um range regressivo com 'downTo'
    // e dessa vez vamos usar o forEach{it} com 'it' ao invés do 'for in'
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach{ print("$it, ") }


    // Validando se está dentro do intervalo ...
    val intervalo = 1500.0..5000.0
    val salario = 5080.0
    if (salario in intervalo) {
        println("\n\nSalário de $salario está dentro do intervalo de $intervalo")
    } else {
        println("\n\nSalário de $salario não está dentro do intervalo de $intervalo")
    }


    val alfabeto = 'a'..'z'
    val letra = 'k'
    println("A letra $letra está dentro do intervalo($alfabeto) ${letra in alfabeto}")

}