public class FraseInvertida {
    public static void main(String[] args) {
        String frase = "Ejemplo para frase invertida";
        String invertido = invertiFrase(frase);


        System.out.println(invertido);

    }

    public static String invertiFrase (String frase){
        String invertido = " ";

        for (int i = frase.length()-1; i >= 0 ; i--) {
            invertido += invertido.charAt(i);

        }
        return invertido;
    }
}

