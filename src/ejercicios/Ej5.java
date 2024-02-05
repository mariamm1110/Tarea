package ejercicios;
import java.util.*;

public class Ej5 {

    public static void main(String args[]) {

        int [] gifts= {3,1,6,5,2,4};
        int i=0;

        ArrayList<Integer> varios = new ArrayList<>();

        boolean sigue=true;

        while (i<gifts.length && sigue ){

            if (varios.contains(gifts[i])){
                sigue=false;
                System.out.println("El primer repetido es: " +gifts[i]);
            }

            varios.add(gifts[i]);

            i++;


        }

        if (sigue){
            System.out.println(-1);
        }



    }
}
