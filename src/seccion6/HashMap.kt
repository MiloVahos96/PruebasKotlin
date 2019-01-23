package seccion6

fun main ( args: Array<String> ) {

    var hashMap = HashMap<Int,String>()


    hashMap.put(1,"Medellin");
    hashMap.put(2,"Bello");
    hashMap.put(3,"Girardota");
    hashMap.put(20,"La estrella");

    for ( clave in hashMap.keys ) {
        println( hashMap[clave] );
    }

}