package MatheusADSantos.com.github

fun testaMap(pedidos: MutableMap<Int, Double>) {
    // Por ser uma variável do tipo Double? podendo receber null
    // Usei 'safe call' ?.let { }
    val pedido = pedidos[2]
    pedido?.let {
        println("pedido $it\n")
    }

    for (p in pedidos) {
        println("número do pedido: ${p.key}\nvalor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}