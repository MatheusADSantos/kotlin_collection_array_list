import java.math.BigDecimal
import java.math.RoundingMode

fun salariosComBigDecimal() {

    val salarios = bigDecimalArrayOf("1500.00", "4000.00", "5700.00", "8500.00", "12000.00")
    val aumento = "1.1".toBigDecimal()
    val salarioComAumento = salarios
        .map { salario ->
            if ( salario < "5000.00".toBigDecimal() ) {
                salario + "500.00".toBigDecimal()
            } else {
                // Aqui estou arredondando para 2 casas decimais e para cima
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }.toTypedArray()
    println(salarioComAumento.contentToString())

}

// Criamos uma função para retornar um array do tipo BigDecimal
// Obs: vararg é para poder passar argumentos variaveis
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }

}