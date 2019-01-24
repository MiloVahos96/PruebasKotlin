package seccion8

class Person () {

    var nombre: String? = null

    // Es lo primero que se ejecuta
    // cuando se crea una instancia de la clase
    constructor( nombre: String,
                 edad: Int,
                 altura: Double,
                 peso: Double,
                 colorOjos: String,
                 genero: String ) : this() {

        this.nombre = nombre
    }

    fun GetNombre() : String? {
        return this.nombre
    }
}

fun main ( args: Array<String> ) {

    var Juan = Person("Juan", 23, 1.70, 66.0, "Negros", "Masculino")
    println(Juan.GetNombre())

}