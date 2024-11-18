public class Pasatiempos {
 /*Hay un tipo de pasatiempos que propone descifrar un texto del que se han suprimido las vocales.
 Por ejemplo, el texto “.n .j.mpl. d. p.s.t..mp.s” se descrifra sustituyendo cada punto por una vocal.
 La solución es “un ejemplo de pasatiempos”.Diseña un programa que ayude al creador de pasatiempos. Recibirá una cadena
 y mostrará otra en la que cada vocal ha sido reemplazada por un punto.
 */

public static void main(String[] args) {
        String textoOriginal = "frase de cambio";
        String textoSinVocales = pasaTiempos ( textoOriginal);

        System.out.print("Texto original: " + textoOriginal);
        System.out.print("Texto descifrado: " + textoSinVocales);
    }
public static String pasaTiempos(String textoOriguinal){

        StringBuilder cambioAPuntos = new StringBuilder();

        //bucle para recorrer los caracteres
    for (int i = 0; i < textoOriguinal.length() ; i++) {
        if ((textoOriguinal.charAt(i) == 'a')
                || textoOriguinal.charAt(i) == 'e'
                || textoOriguinal.charAt(i) == 'i'
                || textoOriguinal.charAt(i) == 'o'
                || textoOriguinal.charAt(i) == 'u')
        {
                cambioAPuntos.append(('.'));
            }else{
                cambioAPuntos.append(textoOriguinal.charAt(i));
            }

        }
    return " ";

    }
}
