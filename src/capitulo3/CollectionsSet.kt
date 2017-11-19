package capitulo3

fun main(args: Array<String>) {
    var b = hashSetOf(1,2,4,2,3,3)

    var c = hashSetOf(7,1,2,4,2,3,3)

    var d = c

    for (numero in b){
        println(numero)
    }
}