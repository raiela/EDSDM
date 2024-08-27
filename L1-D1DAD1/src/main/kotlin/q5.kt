// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun soma(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}

fun main() {
    // 1. Chamadas do primeiro passo

    println(soma(1,3));
    println(multiplica(3,4))
    println(raizQuadrada(4))

    // 2. Chamadas do segundo passo
    println(processaInteiros(1,3, { a, b -> a + b }))
    println(processaInteiros(3,4, { a, b -> a * b}))
    println(processaInteiro(4, ::raizQuadrada))


}