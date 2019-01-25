package seccion9

import java.lang.Exception

fun main ( args: Array<String> ) {

    try {
        print("Ingresa un numero")
        var num1 = readLine()!!.toInt()
        var division = 50 / num1

        println("la division es $division")
    } catch (e: Exception ) {
        println(e.message)
    }
    println("Aplicacion Finalizada")

}