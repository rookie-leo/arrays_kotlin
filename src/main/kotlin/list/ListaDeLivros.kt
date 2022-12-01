package list

fun listaLivros(): MutableList<Livro> {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros = mutableListOf<Livro>(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Fortaleza Digital",
            autor = "Dan Brown",
            anoPublicacao = 1998,
            editora = "St. Martin's Press"
        )
    )

    return livros
}

fun listaLivrosNulos(): List<Livro?> {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros = mutableListOf<Livro?>(livro1, null, livro2, null, livro3, livro4, null)

    livros.add(
        Livro(
            titulo = "Fortaleza Digital",
            autor = "Dan Brown",
            anoPublicacao = 1998,
            editora = "St. Martin's Press"
        )
    )

    return livros
}