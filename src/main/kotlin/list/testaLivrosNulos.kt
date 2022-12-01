package list

fun testaLivrosNulos() {
    println()
    println("Livros Nulos")
    println()

    val livrosNulos: List<Livro?> = listaLivrosNulos()

    livrosNulos.imprimeComMarcadores()

    livrosNulos.sortedBy { it?.titulo }.imprimeComMarcadores()

    livrosNulos.sortedBy { it?.autor }.imprimeComMarcadores()
}