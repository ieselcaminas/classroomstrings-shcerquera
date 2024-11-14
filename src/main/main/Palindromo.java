package main;

//Una palabra es palíndroma si se lee igual de derecha a izquierda como de izquierda a derecha.
// Haz un programa para saber si una palabra es palíndroma.
public class Palindromo {
    public static void main(String[] args) {
        String palabra = "Reconocer";

        if (esPalindromo(palabra)) {
            System.out.print(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }

    public static Boolean esPalindromo(String palabra) {
        // crear un string vacío (palabra invertida) (1)
        String palabraInvertida = "";

        // recorrer la palabra y añadir cada letra, delante del string vacío, tener en cuenta pasar a lowercase (toCharArray) (3)
        for (Character letra : palabra.toLowerCase().toCharArray()) {
            palabraInvertida = letra + palabraInvertida;
        }

        // comparar si la plaba invertida es igual que la palabra original (aquí también a lowecase) (5)
        if (palabra.toLowerCase().equals(palabraInvertida)) {
            return true;
        } else {
            return false;

        }
    }
}

