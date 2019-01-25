package seccion8

class Numeros<T> ( numero: T) {

    init {
        println(numero)
    }

}

fun <T> imprimir ( texto: T) {
    println(texto)
}

fun main ( args: Array<String> ) {

    var num1 = Numeros<Int>(23)
    var num2 = Numeros<Double>(23.3333)
    var num3 = Numeros<Float>(23.12f)
    imprimir<Int>(23)
    imprimir<String>("Hola mundo")

}