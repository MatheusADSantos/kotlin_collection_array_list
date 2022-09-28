package MatheusADSantos.com.github

fun main() {

    val pedidos: Map<Int, Double> = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)

    // Por ser uma variável do tipo Double? podendo receber null
    // Usei 'safe call' ?.let { }
    val pedido = pedidos[2]
    pedido?.let {
        println("pedido $it\n")
    }

    for (pedido in pedidos) {
        println("número do pedido: ${pedido.key}\nvalor do pedido: ${pedido.value}")
    }

}