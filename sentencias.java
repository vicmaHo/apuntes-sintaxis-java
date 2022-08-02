import java.util.Scanner;

public class sentencias {

    public static void main(String[] args) {
        // de esta manera usamos el metodo
        ciclo3();
        
    }

    // aca sacamos esta parte del main y la convertimos en un metodo
    private static void condicional1() {
        // leer un entero desde el teclado, e imprimir si es positivo o negativo
        // variables
        int numero;
        var sc = new Scanner(System.in);


        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt(); // en este caso como quiero un entero uso nextInt

        // condicional en cascada
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            if (numero == 0){
                System.out.println("El numero es igual a 0");
            }else{
                System.out.println("El numero es negativo");
            }
        }
        //  con else if
        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero == 0){
            System.out.println("El numero es igual a 0");
        } else {
            System.out.println("El numero es positivo");
        }

        sc.close();


    }
    private static void condicional2(){
        // prrograma que lee una letra del teclado y dice si es vocal o consonante+
        var sc = new Scanner(System.in);
        System.out.print("Ingrese una letra para saber si es vocal o consonante: ");
        var letra = sc.nextLine();
        
        if (letra.equals("a")) {
            System.out.println("Es una vocal");
        } else if (letra.equals("e")) {
            System.out.println("Es una vocal");
        } else if (letra.equals("i")) {
            System.out.println("Es una vocal");
        } else if (letra.equals("o")) {
            System.out.println("Es una vocal");
        } else if (letra.equals("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
        
        // SWITCH - evalua diferentes casos de una variable, requiere de un break para romper el switch
        // si no uso el break, el va a ir a las demas instrucciones y las ejecuta, por tanto es necesario el break
        switch (letra) {
            case "a":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        // el switch mas reducida
        /* Como varios casos llegan a la misma instruccion, podemos reducir ese switch añadiendo todos los casos
        y luego la instruccion que tiene que seguir, como se ve a continuacion.
        */
        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.printf("%s es una vocal\n", letra);
                break;
            default:
                System.out.printf("%s es una consonante\n", letra);

        }
        sc.close(); 
    }
    private static void ciclo1() {
        // asi se veria el ciclo while en java
        var numero = 5; // inicializacion

        while (numero > 0) { // condicion
            System.out.println(numero--); // avance
        }
        System.out.println("Chaopa");
    }
    private static void ciclo2() {
        // do while
        /* el ciclo do while es similar al while, su unica diferencia es que el ciclo while
        primero verifica la condicion antes de entrar a las instrucciones, el do while primero se ejecuta
        y luego verifica, por tanto el do while se ejecutara al menos una vez, mientras que el while prodria 
        o no ejecutarse
        */
        var numero = 10;

        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0); // al finalizar se pone un ;
        System.out.println("ta luego");  

    }
    private static void ciclo3() {
        // ciclo for - factorial 
        var resultado = 1;
        for (var numero = 5; numero > 0; numero--) {  // en el for se tiene la inicializacion, condicion y avance en una linea
            resultado *= numero;
        }
        System.out.println(resultado);
    }
    private static void ciclo4() {
        // for each
        /* 
        si tengo por ejemploo un array de cadenas , puedo usar el for each, para recorrer el array
        */
        var frutas = new String[] {
            "Manzana", "Pera", "Narajan", "Mandarina" , "Limon" 
        };

        for (var fruta : frutas) { // le digo que creo la variable fruta, y cada fruta equivale a un elemento de el array frutas
            System.out.println("La fruta es: " + fruta); // el elemento asignado se imprime y se pasa al otro elemento
        }
    }
}
