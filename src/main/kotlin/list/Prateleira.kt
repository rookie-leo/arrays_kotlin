package list

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {

    fun organizaPorAutor(): MutableList<Livro> {
        livros.sortedBy { it.autor }
        return livros
    }

    fun organizaPorAnoPublicacao(): MutableList<Livro> {
        livros.sortedBy { it.anoPublicacao }
        return livros
    }

}