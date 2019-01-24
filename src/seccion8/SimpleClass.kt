package seccion8

class Persona ( nombre: String,
                edad: Int,
                altura: Double,
                peso: Double,
                colorOjos: String,
                genero: String
              ) {

    var nombre: String? = null

    // Esto es como el constructor de la clase, es lo primero que se ejecuta
    // cuando se crea una instancia de la clase
    init {
        this.nombre = nombre
    }

    fun GetNombre() : String? {
        return this.nombre
    }
}

fun main ( args: Array<String> ) {

    var Juan = Persona("Juan", 23, 1.70, 66.0, "Negros", "Masculino")
    println(Juan.GetNombre())

}