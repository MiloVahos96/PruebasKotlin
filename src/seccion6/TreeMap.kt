package seccion6

import java.util.*

fun main ( args: Array<String> ) {

    val nums = listOf(1,2,3,4,5,6,7)

    for ( (indice,elemento) in nums.withIndex() ) {
        println( " $indice : $elemento ")
    }

    val map = TreeMap<String,Int>();
    map["seve"] = 17;
    map["alo"] = 29;

    for ( (nombre,edad) in map ) {
        println( " $nombre : $edad ")
    }

}