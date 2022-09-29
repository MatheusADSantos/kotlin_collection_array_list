package MatheusADSantos.com.github

fun main() {

    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 100.0),
        Pair(2, 34.0),
        3 to 50.0, // Obs: 'to' é menos performático que o Pair()
        4 to 150.0,
        5 to 500.0,
        6 to 5.0,
        7 to 20.0
    )

    // Retornos...
    // getOrElse pede 2 parâmetros, uma chave e um lambda(retorno caso não tenha essa chave no map)
    val chave = 12
    val mensagem = pedidos.getOrElse(key = chave, defaultValue = {
        "\nNão tem essa chave/pedido($chave) em pedidos: \n$pedidos"
    })
    println(mensagem)

    // Se não tem a chave no map, retorna um valor padrão do tipo do valor do map
    val valor = pedidos.getOrDefault(key = chave, defaultValue = 1.1)
    println("\nCom a chave($chave), temos o valor: $valor")
    println("Com a chave(5), temos o valor: ${pedidos.getOrDefault(key = 5, defaultValue = 1.1)}")

    // Printando Chaves e Valores do map pedidos
    println("\nTodos as chaves(pedidos): ${pedidos.keys}")
    for (numero in pedidos.keys) {
        println("Pedido: $numero")
    }
    println("\nTodos as valores: ${pedidos.values}")
    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }



    // Filtrando...
    val pedidosMaior100 = pedidos.filter { (numero, valor) -> valor > 100 }
    println("\npedidosMaior100: $pedidosMaior100")
    val pedidosParesComValorMenor150 = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor < 150
    }
    println("\npedidosParesComValorMenor150: $pedidosParesComValorMenor150")

    // Filtrando por valores
    val pedidosMenor100 = pedidos.filterValues { valor ->
        valor < 100
    }
    print("\npedidosMenor100: $pedidosMenor100")

    // Filtrando por chaves
    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("pedidosPares: $pedidosPares")



    // Somando e Subtraindo...
    println("\nSomando\npedidos: $pedidos")
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println("\nSubtraindo\npedidos: $pedidos")
    println(pedidos - listOf(6, 5))

    // Conseguimos remover pela chave ou valor especificamente...
    println("\nRemovendo\npedidos: $pedidos")
    pedidos.values.remove(150.0)
    println("pedidos: $pedidos")
    pedidos.keys.remove(2)
    println("pedidos: $pedidos")
    pedidos -= 1
    print(pedidos)

}