import java.math.BigDecimal
import java.math.RoundingMode

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        // Aqui estou arredondando para 2 casas decimais e para cima
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

// Criamos uma função para retornar um array do tipo BigDecimal
// Obs.: vararg é para poder passar argumentos variáveis
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

// Extension Function - Através do reduce { acc, valor -> acc + valor } onde retornará a somatória dos valores do array
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acc, valor ->
        acc + valor
    }
}

// Extension Function
fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}
