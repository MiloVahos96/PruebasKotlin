package seccion7

fun sum ( num1: Int, num2: Int ) : Int {

    val suma = num1 + num2;
    return suma;

}

fun sum ( num1: Int, num2: Int, num3: Int ) : Int {

    val suma = num1 + num2 + num3;
    return suma;

}


fun main ( args: Array<String> )  {

    val num3 = sum( 4, 8);

}