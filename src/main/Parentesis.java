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

        String texto = "esto (es un (Ejemplo))";

        //verificamos si la palabra esta dentro de un paréntesis
        if (esParentizada(texto)) {
            System.out.println("El texto '" + texto + "' SÍ està bien parentizada.");
        } else {
            System.out.println("El texto '" + texto + "' NO està bien parentizada.");
        }
    }
    public static boolean esParentizada(String texto) {
        int contador = 0;
        boolean seCierraAntesDeAbrirse = false;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '(') {
                contador++;
            } else if (texto.charAt(i) == ')') {
                contador--;

                if (contador == -1) {
                    seCierraAntesDeAbrirse = true;
                    break;
                }
            }
        }

        boolean seAbrenTantosComoSeCierran = contador == 0;

        if (seAbrenTantosComoSeCierran || !seCierraAntesDeAbrirse) {
            return true;
        } else {
            return false;
        }
    }
}
