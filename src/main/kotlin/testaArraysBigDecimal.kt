import java.math.BigDecimal
import java.math.RoundingMode

fun testaArraysBigDecimal() {
    val salarios = bigDecimalArrayOf("1500.50", "2000.00", "3000.10", "5000.00", "10000")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaSalarioRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    println("Total gasto no pagamento de funcionarios: ${salarios.somatoria()}")
}

private fun calculaSalarioRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario >= "5000".toBigDecimal()) {
        (salario * aumento).setScale(2, RoundingMode.UP)
    } else {
        salario + "500".toBigDecimal()
    }

fun bigDecimalArrayOf(vararg valores : String) : Array<BigDecimal> {
    return Array(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}