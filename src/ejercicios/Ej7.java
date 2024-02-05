package ejercicios;

public class Ej7 {

    public static void main(String args[]) {

        String sentence = "123";
        int num = 4;
        int cont = 0;

        char[] chars = sentence.toCharArray();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                if (cont == sentence.length()) {
                    cont = 0;
                }
                System.out.print(chars[cont]);
                cont++;


            }
            System.out.println();

        }
        System.out.println("|");

        /*int padSize = (num - sentence.length()) / 2;
        int padStart = sentence.length() + padSize;
        // Usa printf para formatear el texto centrado
        System.out.printf("%-" + padStart + "s%-" + padSize + "s%n", sentence, "");*/
    }







}

