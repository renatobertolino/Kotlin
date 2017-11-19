package capitulo3

enum class Direcao{
    NORTE, SUL, LESTE, OESTE
}

fun main(args: Array<String>) {

    var array = arrayOf("Sp", "Rj", "PR")

    array[1]= "Sp"

    var c: Char = 'a'
    val b: Boolean = true

    print(array[b.hashCode()])

//    print(Direcao.NORTE.hashCode())

}