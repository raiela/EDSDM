package src.main.kotlin

fun main(){
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")
    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    val filterList = getNewList(listaCursos, "Sistemas")
    printList(filterList)
}

fun printList(listNew: MutableList<String>){
    listNew.forEachIndexed{ index, item ->
        println("$index - $item")
    }
}

fun getNewList(items: MutableList<String>, findWord: String): MutableList<String> {
    val newList: MutableList<String> = mutableListOf()

    for(item in items){
        if (item.contains(findWord, ignoreCase = true)) {
            newList.add(item)
        }
    }

    return newList
}