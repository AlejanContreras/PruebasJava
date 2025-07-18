public class Variables {
    public static void main(String[] args) {
        //Como crear una variable
        int numero = 5;

        //mostar numero en el terminal
        System.out.println(numero);
        System.out.println();
        //TIPOS DE DATOS
        // numericos
        byte bite = 127;
        System.out.println(bite);
        System.out.println(); 
        
        short chort = 32767;
        System.out.println(chort);
        System.out.println();
        
        int entero = -8765321;
        System.out.println(entero);
        System.out.println();
        
        long largo = 987654321;
        System.out.println(largo);
        System.out.println();
        
        float decimalF = 3.141592F;
        System.out.println(decimalF);
        System.out.println();
        
        double decimalD = 2.71828;
        System.out.println(decimalD);
        System.out.println();


        //booleanos
        boolean verdadero = true;
        System.out.println(verdadero);
        System.out.println();

        boolean falso = false;
        System.out.println(falso);
        System.out.println();

        //char o caracter
        char caracter = 'A';
        System.out.println(caracter);
        System.out.println();

        // Strigns o texto
        String texto = "  Arroz Con Pollo ";
        System.out.println(texto);
        System.out.println();

        // Constantes
        final int numeroConstante = 24;
        System.out.println(numeroConstante);
        //numeroConstante = 32; /*el editor directamente lanza error */
        
        // CONVERSION DE TIPOS
        int A = 5;
        String B = "10";
        System.out.println(A + B);
        int C = Integer.parseInt(B);
        System.out.println(A+C);

        System.out.println();
        System.out.println();
        //TIPOS DE REFERENCIA
        // da la cantidad de caracteres
        System.out.println(texto.length());
        // todo el texto en mayuscula
        System.out.println(texto.toUpperCase());
        // todo el texto en minuscula
        System.out.println(texto.toLowerCase());
        // remplaza el texto
        System.out.println(texto.replace("o","a"));
        System.out.println(texto.replace("Pollo","polla"));
        System.out.println(texto.replaceAll("Arroz Con Pollo","Arrocé with polla"));
        // true o false si en el texto esta cierta palabra en el texto
        System.out.println(texto.endsWith("x"));
        System.out.println(texto.startsWith("A"));
        System.out.println(texto.contains("o"));
        // posicion dentro del texto
        System.out.println(texto.indexOf("z"));
        //quita los espacion del principio y final
        System.out.println(texto.trim());

        // Extra
        System.out.println("hola \"mundo\"");
        System.out.println("Archivo\\C");
        System.out.println("Hola \nmundo");
        System.out.println("hola \t mundo");

    }
}
