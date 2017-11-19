package androidpro.capitulo1

fun main(args: Array<String>) {
    var array = arrayOf("Sp", "Rj", "PR")

    array[1]= "Sp"

    println(array[1])

    var mix = arrayOf("Sp", 20, "RJ", 50)

    var inteiros = intArrayOf(1,2,3,4)

    for (m in mix){
        println(m)
    }

    for (inteiro in inteiros){
        println("Inteiro $inteiro")
    }

    for ((index, inteiro) in inteiros.withIndex()){
        println("Index: $index - Inteiros: $inteiro")
    }


}