package seccion8

// Limita el número de objetos que se pueden crear

enum class Meses {

    ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC

}

fun main ( args: Array<String> ) {

    var sextoMes = Meses.JUN
    var primerMes = Meses.ENE
    println("Nombre: " + sextoMes.name )

}