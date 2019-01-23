package seccion5

fun main(args: Array <String>) {

    val nums = 1..50;

    for ( elemento in nums step 2 ) {
        println (elemento);
    }

    for ( elemento in nums.reversed() ) {
        println (elemento);
    }

    for ( elemento in 1 until 16) {
        println (elemento);
    }

}