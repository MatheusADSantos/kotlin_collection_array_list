package MatheusADSantos.com.github

fun main() {

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
    // Para cada pedido retorna um Map<Int, Pedido> -> 'numero=pedido'
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    // Buscando todos pedidos com valor maior que 50
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=2, valor=60.0)])



}

data class Pedido(
    val numero: Int,
    val valor: Double
)