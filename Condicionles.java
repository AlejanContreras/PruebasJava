public class Condicionles {
    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;
        int A = 5;
        int B = 7;
        int C = 5;

        //IF ELSE-IF  ELSE
        //igualdad
        if(v == f){
            System.out.println("verdadero");
        }else{System.out.println("falso");}
        //diferencia
        if(v != f){
            System.out.println("verdadero");
        }else{System.out.println("falso");}
        //and
        if(v && f){
            System.out.println("verdadero");
        }else{System.out.println("falso");}
        //or
        if(v || f){
            System.out.println("verdadero");
        }else{System.out.println("falso");}
        //not
        if(!f){
            System.out.println("verdadero");
        }else{System.out.println("falso");}
        
        //mayor, menor e igual
        if(A == B){
            System.out.println("mayor");
        }else if(A==B){
            System.out.println("igual");
        }else{System.out.println("menor");}
        
        if(A == B){
            System.out.println("igual");
        }else if(A==B){
            System.out.println("mayor");
        }else{System.out.println("menor");}
        
        if(A == C){
            System.out.println("igual");
        }else if(A==C){
            System.out.println("mayor");
        }else{System.out.println("menor");}
        
        if(A > B){
            System.out.println("mayor");
        }else if(A==B){
            System.out.println("igual");
        }else{System.out.println("menor");}
        
        if(A < B){
            System.out.println("mayor");
        }else if(A==B){
            System.out.println("igual");
        }else{System.out.println("menor");}

        if(A <= B){
            System.out.println("mayor");
        }else if(A==B){
            System.out.println("igual");
        }else{System.out.println("menor");}

        if(A >= B){
            System.out.println("mayor");
        }else if(A==B){
            System.out.println("igual");
        }else{System.out.println("menor");}

        if(A >= C){
            System.out.println("igual");
        }else if(A==C){
            System.out.println("mayor");
        }else{System.out.println("menor");}

        System.out.println();
        System.out.println();

        //OPERADOR TERNARIO
        String D;
        System.out.println(D = A<B ? "mayor" : "menor");
        System.out.println(D = v==f ? "verdadero" : "falso");

        System.out.println();
        System.out.println();

        //SWITCH
        /*depende del numero en este caso o valor que halla en el parentesis el programa
        buscara una "respuesta" con ese valor, en su defecto usara la "respeusta" del defaulto*/
        switch (1) {
            case 1:
                System.out.println("perdio");
                break;
            case 2:
                System.out.println("paso raspando");
                break;
            case 3:
                System.out.println("paso");
                break;
            case 4:
                System.out.println("paso con honores");
                break;
            default: System.out.println("numero no valido");
                break;
        }

    }
}
