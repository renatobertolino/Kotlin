package capitulo3

fun main(args: Array<String>) {

    var map = hashMapOf("Chave1" to 1, "Chave2" to 2, "Chave3" to 3)
    map.put("Chave4", 4)

    for (chave in map.keys){
        println("$chave: ${map.get(chave)}")
    }


    //val doubled = ints.map { value -> value * 2 }

}


fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}