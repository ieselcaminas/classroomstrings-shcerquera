public class LongitudI {
    //Realiza un programa que lea una cadena de texto y nos diga cuántas palabras tienen una longitud de k caracteres.

    public static void main(String[] args) {
        String cadena = "Hola, esta es una frase de ejemplo";

        // definir la longitud.
        int k = 5;

        //crear metodo para copntar las palabras.
        int contador = contarPalabrasDeLongitudK(cadena, k);
        // mostrar resultado
        System.out.println("Numero de palabras con longitud " + k + ": " + contador);

    }

    // metodo
    public static int contarPalabrasDeLongitudK(String cadena, int k) {
        //dividir el texto en palabras usadas
        String[] palabras = cadena.split("\\s+");
        int contador = 0;

        //recorrer todas las palabras
        for (String palabra : palabras){
            // se ceutna la longitud de las palabras
            if (palabra.length()== k){
                contador++;
            }
        }
        return contador;

    }
}
