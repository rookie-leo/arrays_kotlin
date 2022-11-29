fun testaArraysInt() {
    var maiorIdade = 0
    val idades: IntArray = intArrayOf(20, 19, 33, 27, 18, 25)

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = maiorIdade
    idades.forEach { idade -> if (idade < menorIdade) menorIdade = idade }

    println(menorIdade)

    println()
    println("Testando funções que buscam a maior e menor idade, e a idade média")
    println("A maior idade é ${idades.max()}")
    println("A menor idade é ${idades.min()}")
    println("A média entre as idades é ${idades.average().toInt()}")

    println()
    val maioresDeIdade = idades.all { it >= 18 }
    println("Todos são maiores de 18 anos? $maioresDeIdade")

    val menorDeIdade = idades.any { it < 18 }
    println("Existe algum menor de idade na lista? $menorDeIdade")

    val rangeDeIdades = idades.filter { it in 20..29 }
    println("Todas as idades entre 20 e 30 anos: $rangeDeIdades")

    val buscaIdade = idades.find { it == 19 }
    println("Idade pesquisada encontrada! $buscaIdade")
}