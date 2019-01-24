package seccion8

open class Humano () {

    fun saludo() {
        println("Hola a todos");
    }

}

class Perro () : Humano() {

    fun ladrido() {
        println("Guauuu");
    }

}

fun main( args: Array<String>) {

    var Persona = Humano();
    Persona.saludo();

    var perrito = Perro();
    perrito.ladrido();
    perrito.saludo();

}
