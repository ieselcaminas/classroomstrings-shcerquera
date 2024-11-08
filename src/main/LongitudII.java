public class LongitudII {
    public static void main(String[] args) {
        String cadena = "Hola, esto es un ejemplo en java";

        // definir la longitud.
        int k = 4;

        mostrarPalabraDeLongitudK(cadena, k);

    }

    //Método que muestra las palabras con lingitud k.

    public static void mostrarPalabraDeLongitudK(String cadena, int k) {
        //dividir el texto en palabras usadas
        String[] palabras = cadena.split("\\s+");
        // variable para defiinir si se encontro alguna palabra
        boolean longitud = false;

        //recorrer todas las palabras
        for (String palabra : palabras){
            // se ceutna la longitud de las palabras
            if (palabra.length()== k){
                //imprimir la palabra.
                System.out.println(palabra);
                longitud = true;
            }
        }
        if (!longitud) {
            System.out.println("No hay palabras con longitud" + k + ".");
        }
    }
}
