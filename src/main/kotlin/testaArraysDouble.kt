fun testaArraysDouble() {
    val salarios: DoubleArray = doubleArrayOf(1500.00, 2300.99, 5000.0, 10000.11)
    val aumento = 1.1

    for (i in salarios.indices) {
        salarios[i] = salarios[i] * aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}