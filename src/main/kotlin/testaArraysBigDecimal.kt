import java.math.BigDecimal
import java.math.RoundingMode

fun testaArraysBigDecimal() {
    val salarios = bigDecimalArrayOf("1500.50", "2000.00", "3000.10", "5000.00", "10000")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario >= "5000".toBigDecimal()) {
                (salario * aumento).setScale(2, RoundingMode.UP)
            } else {
                salario + "500".toBigDecimal()
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores : String) : Array<BigDecimal> {
    return Array(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}