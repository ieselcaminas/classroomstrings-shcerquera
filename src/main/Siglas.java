package main;

public class Siglas {
    //Realiza un programa que lea un frase y la convierta en unas siglas. Por ejemplo, Escuela Oficial de Idiomas,
// se convierte en EOI. Date cuenta que las palabras en minúsculas no forman parte de las siglas.
    public static void main(String[] args) {
        String[] palabras = new String[]{"Desarrollo", "de", "Aplicaciones", "Web"};

        //llamar al metodo
        String siglas = convertirASiglas(palabras);
        System.out.println("Las siglas son: " + siglas);

    }

    public static String convertirASiglas(String[] palabras) {

        StringBuilder siglas = new StringBuilder();


        //recorrer cada palabra
        for (String palabra : palabras) {

            Character primeraLetra = palabra.charAt(0);
            // toString()
            // toUppercase()
            // equals()
            String primeraLetraMayuscula = primeraLetra.toString().toUpperCase();
            if (primeraLetra.toString().equals(primeraLetraMayuscula)){
                siglas.append(primeraLetra);

            }

        }

        return siglas.toString();
    }

}