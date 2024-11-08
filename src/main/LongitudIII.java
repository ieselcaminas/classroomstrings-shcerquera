public class LongitudIII {
    public static void main(String[] args) {
        String cadena = "Hola, esta es una frase de ejemplo en java, 123658";

        // definir la longitud.
        int k = 5;
        //llamar metodo
        verificarPalabrasLargas(cadena, k);

    }

    // metodo
    public static int verificarPalabrasLargas(String cadena, int k) {
        //dividir el texto en palabras usadas
        String[] palabras = cadena.split("\\s+");

        //variable para controlar si encontramos alguna palbra larga
        boolean hayPalabraLarga = false;

        //recorrer todas las palabras
        for (String palabra : palabras) {
            // se ceutna la longitud de las palabras
            if (palabra.length() == k) {
                hayPalabraLarga = true;
                break; // no es necesario seguir
            }
        }
        if (hayPalabraLarga) {
            System.out.println("Hay alguna palabra larga" );
        } else {
            System.out.println("Todas las cadenas son cortas");
        }
        return k;
    }
}
