package androidpro.capitulo1

fun main(args: Array<String>) {
    var idade: Int = 30

    if(idade<18){
        println("Não pode beber")
    }else if(idade<21){
        println("Pode beber 2")
    }else{
        println("Nada demais")
    }

    var str: String = if (idade<18) "Menor de idade" else "Maior de idade"
    println(str)

    var str2: String = if (idade<30) {
        "Suave"
    }else{
        "Massa"
    }
    println(str2)
}