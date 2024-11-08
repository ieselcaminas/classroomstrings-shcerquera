public class Alfabetica {
    //Una palabra es alfabética si todas sus letras están ordenadas alfabéticamente.
    // Por ejemplo, “amor”, “chino” e “himno” son palabras alfabéticas. Diseña un programa
    // que nos diga si una palabra es alfabética o no.
    public static void main(String[] args) {

        String palabra = "amarillo";

        if (esAlfabetica(palabra)){
            System.out.println(palabra + ", es una palabra alfabetica");
        }else {
            System.out.println( palabra + ", no es unapalabra alfabetica");
        }

    }
    public static boolean esAlfabetica(String palabra){
        for (int i = 0; i < palabra.length() -1; i++) {
            char c = palabra.charAt(i);

            if (!Character.isLetter(c)){
                return false;
            }

        }
        return true;
    }
}
