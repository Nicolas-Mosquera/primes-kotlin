fun esPar(n: Int): Boolean {
    return n % 2 == 0
}

fun main() {
    val entrada = listOf(1, 2, 4, 7, 13, 9, 23)
    val salida = entrada.map { esPar(it) }

    println("IN:  $entrada")
    println("OUT: $salida")
}
