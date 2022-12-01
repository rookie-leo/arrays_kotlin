package list

fun usaPrateleira() {
    val prateleira = Prateleira(genero = "Suspense", livros = listaLivros())

    val organizaPorAutor = prateleira.organizaPorAutor()
    val organizaPorAnoPublicacao = prateleira.organizaPorAnoPublicacao()

    organizaPorAutor.imprimeComMarcadores()
    organizaPorAnoPublicacao.imprimeComMarcadores()
}