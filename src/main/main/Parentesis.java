package main;
//Un texto está bien parentizado si por cada paréntesis abierto hay otro detrás que lo cierra. Por ejemplo, la cadena
// Esto (es (un ejemplo) (de) una (cadena bien) parentizada)
//está bien parentizada.
//
//Pero las cadenas
//    una )cadena (mal (parentizada)
//    y
//    (una)(
//no lo están.
//Diseña un programa que nos diga si una cadena está bien parentizada o no.
public class Parentesis {
    public static void main(String[] args) {

        String texto = "este es un (Ejemplo) y otro (texto)";
        String palabra = "  ";




        //verificamos si la palabra esta dentro de un paréntesis
        if (esParentizada(palabra)) {
            System.out.println("La palabra' " + texto + " ' està dentro de parèntesis.");
        }else {
            System.out.println("La palabra' " + texto + " ' No està dentro de parèntesis.");
        }



    }
    public static boolean esParentizada(String palabra){
        //definimos las variantes
        int inicioParentesis = -1;
        int finParentesis = -1;

        //recorremos el texto para encontrar los paréntesis
        String texto = "";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '(') {
                inicioParentesis = i;
            } else if (texto.charAt(i) == ')') {
                finParentesis = i;


                //si encontramos paréntesis de apertura y cierre verificamos si la palabra esta dentro
                if (inicioParentesis != -1 && finParentesis != -1 && inicioParentesis < finParentesis) {
                    String contenidoEnParentesis = texto.substring(inicioParentesis + 1, finParentesis);
                    if (contenidoEnParentesis.contains(palabra)) {
                        return true;
                    }
                    // reiniciamos las posiciones para buscar nuevos parentesis
                    inicioParentesis = -1;

                }

            }
        }
        return false;


    }
}//
