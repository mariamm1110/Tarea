package ejercicios;

public class Ej6 {

    public static void main(String args[]) {
        String s1 = "stepffor";
        String s2 = "stepfor";
        char letraRara = ' ';


        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        int i = 0;

        if (char1.length == char2.length) {
            letraRara = '1';
        } else {

            char[] longerArray = char1.length > char2.length ? char1 : char2;
            char[] shorterArray = char1.length < char2.length ? char1 : char2;


            while (i < shorterArray.length && char1[i] == char2[i]) {


                i++;
            }

            //si está al final
            if (i == shorterArray.length - 1) {


                letraRara = longerArray[i + 1];

            }

            if ((char1.length - i) > (char2.length - i)) {
                letraRara = char1[i];
            } else {
                letraRara = char2[i];
            }


        }

        System.out.println(letraRara);
    }


}
