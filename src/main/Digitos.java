public class Digitos {
    public static void main(String[] args) {

        String cadenaDigitos = "Hola 123, es un ejemplo 456, java digitos 102030 ";

        int cantidaDeDigitos = contarDigitos ( cadenaDigitos);

        System.out.println("Cantidad de digitos en la cadena : " + cantidaDeDigitos);

    }
    //metodo
    public static int contarDigitos(String cadenaDigitos) {

        //inicializa el contado de digitos
        int contador = 0;

        //Recorrer  la cadena
        for (int i = 0; i < cadenaDigitos.length(); i++) {
            //obtener el caracter en la posicion actual
            char c = cadenaDigitos.charAt(i);

            //verificar si el caracter es un digito entre 0 y 9
            if (Character.isDigit(c)) {
                contador++;

            }
        }
        return contador;
    }
}


