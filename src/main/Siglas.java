public class Siglas {
//Realiza un programa que lea un frase y la convierta en unas siglas. Por ejemplo, Escuela Oficial de Idiomas,
// se convierte en EOI. Date cuenta que las palabras en minúsculas no forman parte de las siglas.
    public static void main(String[] args) {
        String frase = "Desarrollo de Aplicaciones Web";

        //llamar al metodo
        String siglas  = convertirASiglas(frase);
        System.out.println("Las siglas son: " + siglas);

    }
    public static String convertirASiglas(String frase){

        String[] palabras = frase.split(" ");
        StringBuilder siglas = new StringBuilder();

        //recorrer cada palbra
        for( String palabra : palabras) {
            siglas.append(palabra.charAt(0));

            }

        return siglas.toString();
    }

}// no se va la minuscula "de"
