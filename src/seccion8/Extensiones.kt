package seccion8

fun ArrayList<String>.intercambiar( indice1: Int, indice2: Int ) {

    var temp = this.get(indice1)
    this.set(indice1, this.get(indice2))
    this.set(indice2, temp)

}

fun main ( args: Array<String> ) {

    var arrayList = ArrayList<String>()

    arrayList.add("Seve")
    arrayList.add("Hola")
    println(arrayList)
    arrayList.intercambiar(0,1)
    println(arrayList)

}