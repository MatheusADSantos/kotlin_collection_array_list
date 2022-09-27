import java.math.BigDecimal
import java.math.RoundingMode
//    https://www.alura.com.br/artigos/arredondamento-no-java-do-double-ao-bigdecimal

fun salariosComBigDecimal() {

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    val aumento = "1.1".toBigDecimal()

    val salarioComAumento = salarios.map { salario -> calculaAumentoRelativo(salario, aumento) }.toTypedArray()
    println(salarioComAumento.contentToString())

    val somatoriaDosSalariosComAumento = salarioComAumento.somatoria()
    println("Salários somados após os aumentos: $somatoriaDosSalariosComAumento")

    val media = salarioComAumento.sorted().takeLast(3).toTypedArray().media()
    println("Média dos 3 utimos salários: $media")

    val mediaMenoresSalarios = salarioComAumento.sorted().take(3).toTypedArray().media()
    println("Média dos 3 primeiros salários: $mediaMenoresSalarios")

    val meses = 6.toBigDecimal()
    val gastosTotal = salarioComAumento.fold(somatoriaDosSalariosComAumento) { acc, salario ->
        println("\n\nsalarioComAumento: ${salarioComAumento.contentToString()}")
        println("somatoriaDosSalariosComAumento: $somatoriaDosSalariosComAumento")
        println("acc: $acc")
        println("salario: $salario")
        println()

        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastosTotal)

}