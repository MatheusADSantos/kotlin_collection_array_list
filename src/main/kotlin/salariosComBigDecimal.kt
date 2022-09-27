import java.math.BigDecimal
import java.math.RoundingMode
//    https://www.alura.com.br/artigos/arredondamento-no-java-do-double-ao-bigdecimal

fun salariosComBigDecimal() {

    val salarios = bigDecimalArrayOf("1500.00", "4000.00", "5700.00", "8500.00", "12000.00")
    val aumento = "1.1".toBigDecimal()
    val salarioComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }.toTypedArray()
    println(salarioComAumento.contentToString())

    val somatoriaDosSalariosComAumento = salarioComAumento.somatoria()
    println("Salários somados após os aumentos: $somatoriaDosSalariosComAumento")

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        // Aqui estou arredondando para 2 casas decimais e para cima
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

// Criamos uma função para retornar um array do tipo BigDecimal
// Obs: vararg é para poder passar argumentos variaveis
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

// Um Array<BigDecimal> chamará o método somatario() onde retornará um reduce{acc, valor:BigDecimal -> }
// Ou seja, o reduce, irá reduzir este array a um único valor ...
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce {acc, valor ->
        acc + valor
    }
}