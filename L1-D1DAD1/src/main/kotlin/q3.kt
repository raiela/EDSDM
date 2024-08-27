package src.main.kotlin

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun foo(i: Int, j: Int, operation: (Int, Int) -> Int): Int {
    return operation(i, j)
}

fun bar(firstPart: String, secondPart: String, operation: (String, String) -> String): String{
    return operation(firstPart, secondPart)
}
