package src.main.kotlin

fun main() {
    xpto(2, 3, ::soma)
    xpto("Jo", "ão", ::cat)
}

fun <T> xpto(i: T, j: T, operation: (T, T) -> T) {
    println(operation(i, j))
}
