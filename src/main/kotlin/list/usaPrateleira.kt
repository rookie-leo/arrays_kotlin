package list

fun usaPrateleira() {
    val prateleira = Prateleira(genero = "Suspense", livros = listaLivros())

    prateleira.organizaPorAutor().imprimeComMarcadores()
    prateleira.organizaPorAnoPublicacao().imprimeComMarcadores()
}