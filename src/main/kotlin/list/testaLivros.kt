package list

fun testaLivros() {
    val livros: List<Livro> = listaLivros()

    livros.imprimeComMarcadores()

    livros.sorted().imprimeComMarcadores() //ordena por anoPublicacao

    livros.sortedBy { it.titulo }.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    println()
    println("Livros Nulos")
    println()

    val livrosNulos: List<Livro?> = listaLivrosNulos()

    livrosNulos.imprimeComMarcadores()

    livrosNulos.sortedBy { it?.titulo }.imprimeComMarcadores()

    livrosNulos.sortedBy { it?.autor }.imprimeComMarcadores()


}

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("################### Lista de Livros ###################\n$textoFormatado")
}