package androidpro.capitulo1

fun main(args: Array<String>) {

    var opcao: Int = 5

    when (opcao){
        1 -> println("Conta Corrente")
        2 -> println("Cartão de crédito")
        3 -> println("Internet Banking")
        else -> {
            println("Nenhuma opção encontrada!")
            println("Fale com um de nossos atendentes!")
        }

    }

    var opcaoSel = when (opcao){
        1 -> "Conta Corrente"
        2 -> "Cartão de crédito"
        3 -> "Internet Banking"
        else -> {
            println("Nenhuma opção encontrada!")
            println("Fale com um de nossos atendentes!")
            "Nenhuma opção encontrada"
        }
    }

    println("Opção selecionada: $opcao - $opcaoSel")
}