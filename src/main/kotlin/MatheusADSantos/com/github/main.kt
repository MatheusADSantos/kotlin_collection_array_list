package MatheusADSantos.com.github

fun main() {

    val assistiramCursoKotlin = setOf<String>("Matheus", "Marcela", "Ana", "Carol", "Rafa")
    val assistiramCursoJava = setOf<String>("Matheus", "Israel", "Daniel")

    val assistiramAmbas = mutableSetOf<String>()
    assistiramAmbas.addAll(assistiramCursoKotlin)
    assistiramAmbas.addAll(assistiramCursoJava)
    assistiramAmbas.add("Maria")
    assistiramAmbas.add("Maria") // Não irá add outra Ana, pq o set só aceita elementos unicos
//    println(assistiramAmbas)

    // União(+) entre 2 set: Soma tudo
    println(assistiramCursoJava + assistiramCursoKotlin)
    println(assistiramCursoJava union assistiramCursoKotlin)

    // Subtração(-) entre 2 set: Diferença entre elas
    println(assistiramCursoJava - assistiramCursoKotlin)
    println(assistiramCursoJava subtract assistiramCursoKotlin)

    // Intersecção entre 2 set: O que tem em ambas
    println(assistiramCursoJava intersect assistiramCursoKotlin)

    // Fazendo uma cópia para MutableList, permitindo assim repetir os elementos
    val assistiramAmbasList = assistiramAmbas.toMutableList()
    assistiramAmbasList.add("Matheus")
    println(assistiramAmbasList)
    // Aqui converto pra Set novamente, printando os elementos unicos
    println(assistiramAmbasList.toSet())
}