import java.util.Scanner;

public class salidaIngresoCompilacion {
    // en java cuando creamos un archivo fuente, debemos
    // tener una clase creada, y esta  clase debe contener
    // el nombre del archivo, como se ve arriba
    /*  en java todas las instrucciones van dentro de la clase 
    que aparece al principio, pero mas concretamente, para que un archivo de java
    sea ejecutable, las instrucciones deben estar dentro del metodo main (el que aparece
    abajo)
    */
    public static void main(String[] args) {
        /*
        aca deberan ir las instrucciones para que el archivo sea ejecutable
         */
        var nombre = "Victor";

        // IMPRIMIR EN PANTALLA - System.out.println()
        // el println --> imprimo y hago un salto de linea
        // print --> imprimo y no salto de linea
        System.out.print("Hola ");
        System.out.print(nombre);
        System.out.println("!");

        // tambien se puede hacer de esta forma
        System.out.println("Hola "+ nombre + "!");

        // podemos hacer uso de cadenass formateadas, usando printf
        /* 
        %s      para cadenas
        %d      para numeros
        %f      para numeros decimales  (si queremos una cantidad de decimales '%.2f' el numero es la cantidad de decimales)
        */
        System.out.printf("Hola, %s!: %d - %.2f\n", nombre, 5, 4.567);


        // INGRESAR DATOS
        // existen dos formas, usando la clase scanner, o BufferedReader, de java 8 en adelante usamos scanner 

        var sc = new Scanner(System.in); // para usarlo importamos el paquete util del paquete java

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine(); // aca usamos sc, para leer la siguiente linea, es necesario usar un mensaje para indicar lo que
                                // se ingresa
        System.out.printf("Tu nombre es: %s\n", nombre);
        // el scanner se queda leyendo el teclado, por tanto es necesario cerrarlo, ya que es posible que necesite
        // leer otra vez, lo ideal es que al finalizar el programa es necesario cerrar el scanner con sc.close()

        sc.close();


        //COMPILACION DEN JAVA
        /* 
        Java es un lenguaje compilado, al ser compilado genera un archivo ejecutable
        el cual es el que le entrego a mi cliente
        Para compilar se hace lo siguiente:
        en consola usamos el comando 'javac nombrearchivo.java' javac es el compilador de java
        lo anterior genera un archivo compilado .class, ese es el archivo ejecutable
        de la maquina virtual, java runtine environment, jre
        este puede ser ejecutado con el comando 'java nombrearchivo', es un archivo Bytecode
        el cual es un codigo ejecutable en el ambiente de ejecucion de java

        */
    }
}
