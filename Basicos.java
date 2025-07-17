import java.util.Scanner;

//Estructura basica para poder codificar en java

public class /*nombre del archivo ->*/Basicos {

    public static void main(String[] args) {
        //Codigo
        //Imprimir o mostrar en cosola
        System.out.println("Hola Mundo");

        // PARA NOTAS DE 1 LINEA
        /*PARA NOTAS
         * DE VARIAS
         * LINEAS
         */
        System.out.println();
        //SCANNER
        /*Scaner o para leer informacion enviada desde el terminal,
        para crearlo toca importar la bilioteca de: java.util.Scanner;
        y crearle una variable como la siguiente*/
            
        System.out.println("Ingrese algun numero");
        //variable para el scanner
        int mostrarScanner;
        //scanner
        Scanner tecladoScanner = new Scanner(System.in);
        // guardar lo "escaneado" en la variable
        mostrarScanner = tecladoScanner.nextInt();
        //impresion del texto escaneado
        System.out.println(mostrarScanner);
        
        //EL EJEMPLO ANTERIOR FUE PAGAR NUMEROS, AHORA PARA TEXTO

        System.out.println();

        System.out.println("Ingrese alguna palabra");
        String mostrarTexto;
        Scanner teclado = new Scanner(System.in);
        mostrarTexto = teclado.nextLine();
        System.out.println(mostrarTexto);

    }
}