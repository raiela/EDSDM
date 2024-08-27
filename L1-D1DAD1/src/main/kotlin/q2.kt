package src.main.kotlin

fun main(){
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai",
        "Pedro"), Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca")
    )

    familiaMap.forEach { (key, value) ->
        print("$key: $value\n")
    }
}