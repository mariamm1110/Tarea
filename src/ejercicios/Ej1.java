package ejercicios;

import java.util.Arrays;

public class Ej1 {
    public static void main(String args[]){

        int [] num= {1,2,3,4,5,6,7,8,9,9,7,6,5,4,3,2,1};

        // 1,1,2,3,3,4,4,5,5,6,6,7,7,8,8,9,

        int noRep=-1;

        Arrays.sort(num);



        for (int i=0; i<num.length-1; i++){

            if(i==0){
                if(num[i]!=num[i+1]){
                    noRep=num[i];
                }
            }

            if(num[i]!=num[i+1] && num[i]!=num[i-1] ){
                noRep=num[i];
            }

        }

        if (noRep==-1){
            System.out.println(num[num.length-1]);
        }else{
            System.out.println(noRep);
        }
    }
}
//ODIO GITHUB