package Apuntes;
public class sintaxisLenguaje {
    public static void main(String[] args) {




        // esto es un comentario de una linea
        /*esto
          es un comentario 
         de varias lineas
         */

         /**
        * esto es un comentario de 
        * documentacion, se usa en el javadoc de 
        * nuestro proyecto
        */


        // SENTENCIAS
        int a = 1;String b="B"; /*esto es una sentencia, todas las sentencias terminan con ;
                    los espacios en blanco solo son necesarios para legebilidad,
                    no importan en la ejecucion del codigo, identar en este lenguaje
                    no es necesario, pero mejora la legibiliad */
        System.out.println(a + b);
        // sumar dos numeros
        int d = 2; int c = 2;  /*  en este caso comprobamos que se pueden escribir varias instrucciones
                                en una linea, pero lo ideal es hacerlo en lineas separaddas*/
        System.out.println(d + c);

        // DEFINICION DE VARIABLES
        // Es importante declarar las variables antes de usarlas, tipo de dato nombre = valor
        // no se podra modificar el tipo de dato despues de ser creada
        int x = 0;
        String nombre = "victor";
        double z = 3.5;
        boolean bNuevo = true;
        int[] datos;

        // tambien podeos usar var para definir variables, es importante que al usar var, 
        // le asignemos el valor a la variable para que java infiera que tipo de dato sera
        var numero = 4;
        var cadena = "H0l0";
        // En caso de que no sepamos el valor, no se podra usar var
        // usaremos var siempre que podamos

        // TIPOS DE DATOS PRIMITIVOS EN JAVA - con sus valores por defecto (si l ocreo y no le asigno valor ese sera el valor que tendra)
        boolean booleanos = false; // un dato booleano que equivale a un 1 o  0, (true - false) y ocupa un bit
        byte bytes = 0; // dato que ocupa 8 bits, y tiene un rango de -128 hasta 127
        char caracter = '\u0000'; // dato que ocupa 16 bits, o 2 bytes. almacena codigos de letras unicode
        short  numeroCorto = 0; // dato numerico que ocupa 16 bits, almacena los numeros desde -32768 hasta 32767
        int numeroEntero = 0; // dato numerico que ocupa 32 bits, 4 bytes, perite el uso de un rango numerico mucho mas grande
        long numeroLong = 0L; // dato numerico que ocupa 64 bits, permite el uso de un rango numerico muy grande     
        float numeroFloat = 0.0F; // dato numerico que ocupa 32 bits, permite el uso de decimales
        double numeroDouble = 0.0; // dato numerico que ocupa 64 bits, permite el uso de decimales en mayor cantidad
        // por defecto los tipos de datos numericos usaremos int, podremos separa numeros muy grandes con _, java ignora esto
        // solo sirve para mejorar la legibilidad
        // para datos de  tipo decimal, usaremos por defecto el double

        // como tipos especiales de caracteres tenemos las secuencias de escape
        /*\t    tabulador
         * \b   backspace
         * \n   nueva linea 
         * \r   retroceso de carro
         * \f   salto de linea
         * \\ \'   \""
         */


         // TIPO DE DATO  ESPECIAL STRING
         // se define como una coleccion de char, encerrados en comiillas dobles "", en java los Strings son
         // objetos, no como en otros lenguajes que consideran a los string como arrays
         String cadena2 = "HOla mundo";
         var nombre2 = "victor manuel hernandez ortiz";

         // IDENTIFICADORES
         /*basicamente es la forma en como vamos a nombrar sean variables, metodo etc
          existen ciertas reglas a la hora de colocar un nombre valido*/


        // EXPRESIONES
        // esto hace referencia a todo lo que se encuentra despues de el operador de asignacion
        // y tambien cuando se usan condiciones
        int numero2;
        nombre2 = "Manuel";
        numero = 4 + 5;
        numero2 = numero + 10;
        
        //OPERADORES
        /* +        +=
        -        -= 
        /        /=
        %        %=
        *        *=
         
        operdores de incremento y de decremento
        variable++ incremento en 1
        variable-- decremento en 1
        si el incremento o decremento se encuentra antes, reduce o aumeta la variable y despues la usa
        pero si esta despues, se usa el valor y luego incrementa    

         */

        // OPERADORES CONDICIONALES - devuelven resultados booleanos
        /*
         < menor que
         > mayo que
         <= menor o igual que
         >= mayor o igual que
         == igual que
         != distinto de
         */
        // OPERADORES LOGICOS
        /* java cuenta con operadores logicos que pueden ir bit a bit, y tambien con operadores logicos
         que devuelven true o false
        BIT A BIT
        |   suma logica - OR
        ^   suma logica exclusiva - XOR
        &   producto logico - AND
        
        !   negacion  NOT
        ||  suma logica con cortocircuito   - devuelve true si uno o ambos operadores son true, de lo contrario devuelve false
        &&  producto logico con cortocircuito - devuelve true si ambos operadores son true, de lo contrario devuelve false
         */

        // OPERADOR CONDICIONAL TERNARIO - condicional de una linea, si se cumple la condicion da un valor, si no se cumple da otro
        /*
         si a > 5 entonces haga esto de lo contrario haga esto
         (a > 5 ? 1 : 0) si a es mayor que 5 devuelva un 1, de lo contrario devuelva cero
         */

        
        
    }
    

}