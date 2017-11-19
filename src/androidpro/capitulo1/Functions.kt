package androidpro.capitulo1

import java.util.*

/*fun main(args: Array<String>) {

    val a = olaMundo()
    println(queHorasSao())

    val sum: (Int, Int) -> Int = { x, y -> x + y }
    sum(2,3)


    double(1)
    var total = soma(10,12)
    println(total)
}
*/
fun soma(a: Int, b: Int): Int{
    return a+b
}

fun queHorasSao(): Date{

    return Date()

}

fun olaMundo(){
    println("Olá mundo")
}

fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {
    //...
}


fun double(x: Int): Int = x * 2


fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun main(args: Array<String>) {
    val list = asList(1, 2, 3)
}

/*
fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: Set<Vertex>) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v, visited)
    }

    dfs(graph.vertices[0], HashSet())
}



fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}*/