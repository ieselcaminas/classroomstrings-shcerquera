public class Digitos2 {
    public static void main(String[] args) {
        System.out.println(esNumero("1233"));


    }

    public static boolean esNumero(String cadena) {
        int contador = 0;
        boolean esNumero = true;

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                esNumero = false;
            }

        }
        return esNumero;
    }

    public static int esUnNumeroPalabra(String cadena) {
        int contador = 0;
        String[] palabras = cadena.split(" ");
        boolean esNumero = true;

        for (int i = 0; i < palabras.length; i++) {
            esNumero = true;
            for (int j = 0; j <palabras[i].length() ; j++) {

            }
            if (!Character.isDigit(cadena.charAt(i))) {
                esNumero = false;
                break;
            }
        }
        if (esNumero) contador++;


        return contador;

    }

}

