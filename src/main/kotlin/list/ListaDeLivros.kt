package list

fun main() {
    livros
        .groupBy { it.editora ?: "Editora Desconhecida" } // Elvis Operator: Caso retorne null, mostre a msg
        .forEach {(editora: String, livros: List<Livro>) ->
            println("Editora: $editora -> ${livros.joinToString { it.titulo }}")
        }
}