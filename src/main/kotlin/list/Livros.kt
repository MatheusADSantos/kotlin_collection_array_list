package list

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

// Criando uma lista do tipo MutableList<Livro>
val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

// Criando uma lista do tipo MutableList<Livro?> por ser do tipo <Livro?> pode receber null...
val livrosComNulos: MutableList<Livro?> = mutableListOf(livro1, null,  livro2, null, livro3, livro4, null)