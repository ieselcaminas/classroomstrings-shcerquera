package main;

import java.util.Scanner;

//Haz un programa que lea dos cadenas que representen a sendos números binarios.
// A continuación, el programa mostrará el número binario que resulta de sumar ambos (y que será otra cadena).
// Si, por ejemplo, el usuario introduce las cadenas ‘100’ y ‘111’, el programa mostrará como resultado la cadena ‘1011’
public class Sumabinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero binario: ");
        String num1 = sc.nextLine();

        System.out.print("Introduce el segundo numero binario: ");
        String num2 = sc.nextLine();


    }
    }

//    public static String sumaBinario(String num1, String num2) {
//        String res = "";
//        int digitoA = Integer.parseInt(" " + num1.charAt(0));
//        char b1;
//        char b2;
//        int bit1;
//        int bit2;
//        int acarreo = 0;
//        int suma;
//
//        for (int i = num1.length() - 1; i >= 0; i--) {
//            //sumar los digitos iesimos
//            //si la suma es 0-<00
//            b1 = num1.charAt(i);
//            b2 = num2.charAt(i);
//            bit1 = Integer.parseInt("" + b1);
//            bit2 = Integer.parseInt("" + b2);
//
//            suma = bit1 + bit2 + acarreo;
//
//            if (suma == 0) {
//                res = "0" + res;
//                acarreo = 0;
//            } else if (suma == 2) {
//                res = "0" + res;
//                acarreo = 1;
//            } else {
//                res = "1" + res;
//                acarreo = 1;
//            }
//
//        }
//        if (acarreo == 1) {
//            res = "1" + res;
//        }
//        return res;
//    }
//}
