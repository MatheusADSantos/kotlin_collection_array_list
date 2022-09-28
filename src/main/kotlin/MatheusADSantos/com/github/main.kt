package MatheusADSantos.com.github

fun main() {

    val assistiramCursoKotlin = setOf<String>("Matheus", "Marcela", "Ana", "Carol", "Rafa")
    val assistiramCursoJava = setOf<String>("Matheus", "Israel", "Daniel")

    val assistiramAmbas = mutableSetOf<String>()
    assistiramAmbas.addAll(assistiramCursoKotlin)
    assistiramAmbas.addAll(assistiramCursoJava)
    assistiramAmbas.add("Maria")
    assistiramAmbas.add("Maria") // Não irá add outra Ana, pq o set só aceita elementos unicos
    println(assistiramAmbas)

}