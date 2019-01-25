package seccion8

class Externa {

    val nombre: String? = null

    class Anidada {

        fun mostrar() {
            println("Soy una clase anidada")
        }

    }

    inner class Anidada2 {

        fun mostrar() {
            println("Soy una clase anidada" + nombre)
        }

    }

}

fun main ( args: Array<String>) {

    var externa = Externa()
    var anidada = Externa.Anidada()

}