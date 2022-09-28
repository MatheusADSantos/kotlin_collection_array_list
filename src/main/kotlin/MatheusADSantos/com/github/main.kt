package MatheusADSantos.com.github

fun main() {

    val assistiramCursoKotlin = listOf<String>("Matheus", "Marcela", "Ana", "Carol", "Rafa")
    val assistiramCursoJava = listOf<String>("Matheus", "Israel", "Daniel")

    val assistiramAmbas = assistiramCursoJava + assistiramCursoKotlin
    println(assistiramAmbas.distinct())

}