package capitulo3

import capitulo2.Dirigivel
import capitulo2.Veiculo


fun soma(numA: Int, numB: Int) = numA + numB

interface Dirigivel {
    fun acelerar(velocidade: Long)
}

open class Veiculo(open var cor: String,open var ano: Int, open var modelo: String){

}

class Carro(override var cor: String,override var ano: Int,override var modelo: String):
        Veiculo(cor, ano, modelo), Dirigivel {

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade Km/h")
    }

    fun abrirPorta(){
        println("Abrindo a porta do ${modelo}")
    }

}











fun main(args: Array<String>) {
    
    val variavelImutavel = 10
    var variavelMutavel= 11
    
    val carro: Carro = Carro("Amarelo", 2018, "uno")
    carro.abrirPorta()
    carro.acelerar(1123)

    maxOf(variavelImutavel, variavelMutavel)
    
    
 //   printSoma(variavelImutavel,variavelMutavel)



    val a: Int =1 //Atribuição imediata
    val b = 2   // Tipo Int é inferido
    val c: Int  // Tipo necessário quando nenhum inicializador é fornecido
    c = 3       // atribuição diferida



}

fun printProduct(x: String, y: String) {

    //...
   // if (x == null) {
     //   println("Wrong number format in arg1: '$arg1'")
       // return
   // }
    //if (y == null) {
      //  println("Wrong number format in arg2: '$arg2'")
       // return
    //}

    //x e y são automaticamente transferidos para não anulável após a verificação nula
   // println(x * y)




}

fun geftStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` é automaticamente transferido para String
    return obj.length
}


fun hahaha(){

    val items = listOf("Maçã", "Banana", "Kiwi")
    for (index in items.indices) {
        println("item em $index é ${items[index]}")
    }

}


fun getStringLedngth(obj: Any) {

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }
}



//fun printSoma(numA: Int, numB: Int) {
  //  println("A soma entre $numA e $numB é ${numA + numB}")
//}

//fun maxOf(a: Int, b: Int) = if (a > b) a else b


