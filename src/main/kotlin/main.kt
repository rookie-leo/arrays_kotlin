fun main() {
    val idade1 = 20
    val idade2 = 33
    val idade3 = 45
    val idade4 = 40

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println(maiorIdade)

    val idades = IntArray(4)
    idades[0] = 20
    idades[1] = 45
    idades[2] = 33
    idades[3] = 40
}