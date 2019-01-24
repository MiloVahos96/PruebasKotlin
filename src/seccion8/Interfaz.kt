package seccion8

interface Operacion {

    fun sum( num1: Int, num2: Int ) : Int

}

class Oper: Operacion {

    override fun sum(num1: Int, num2: Int): Int {
        return ( num1 + num2 );
    }

}