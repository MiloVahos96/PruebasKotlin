package seccion9

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main ( args: Array<String> ) {

    escribirArchivo("Texto de prueba")
    leerArchivo()

}

fun escribirArchivo( texto: String ) {

    try {
        var archivo = FileWriter("prueba.txt",true)
        archivo.write(texto + "\n")
        archivo.close()
        println("Se ha guardado correctamente")
    } catch ( e: Exception) {
        println(e.message)
    }

}

fun leerArchivo() {

    try {
        var leer =  FileReader("prueba.txt")
        var caracter: Int?

        do {
            caracter = leer.read();
            print(caracter.toChar())
        } while ( caracter != -1 )

    } catch ( e: Exception) {
        println(e.message)
    }

}