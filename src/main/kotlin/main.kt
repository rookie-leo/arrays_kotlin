fun main() {
    var maiorIdade = 0
    val idades : IntArray = intArrayOf(20, 19, 33, 27)

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = maiorIdade
    idades.forEach { idade -> if ( idade < menorIdade) menorIdade = idade }

    println(menorIdade)

}