package capitulo2

class Livro(val titulo: String, val autor: String, val ano: Int){
    override fun toString(): String {
        return "Livro[titulo=$titulo]"
    }
}

data class DataLivro(val titulo: String, val autor: String, val ano: Int)




fun main(args: Array<String>) {
    val livro = Livro("AndroidPro Book", "Fillipe Cordeiro", 2017)
    val livro2 = Livro("AndroidPro Book", "Fillipe Cordeiro", 2017)
    val dataLivro = DataLivro("AndroidPro Book", "Fillipe Cordeiro", 2017)
    val dataLivro2 = DataLivro("AndroidPro Book", "Fillipe Cordeiro", 2017)

    println(livro)
    println(dataLivro)

    println(livro.equals(livro2))
    println(dataLivro.equals(dataLivro2))
}