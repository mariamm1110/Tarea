package ejercicios;
import java.util.ArrayList;
import java.util.List;

import  static ejercicios.Ej2.primos;

public class Ej3 {
    public static void main(String[] args) {
        int n = 10000;
        List <Integer> arr = primos(n + 1);

        ArrayList<Integer> nums = new ArrayList<>();

        int i = 0;
        int sum = 0;
        while(sum < n){
            sum += arr.get(i);
            nums.add(arr.get(i));
            i++;
        }

        boolean flag = false;
        while(!flag){
            if(binarySearch(arr, sum) == -1){
                sum -= nums.get(nums.size() - 1);
                nums.removeLast();
            } else
                flag = true;
        }

        if(flag) {
            for (int j = 0; j < nums.size(); j++) {
                if (j != nums.size() - 1)
                    System.out.print(nums.get(j) + " + ");
                else
                    System.out.print(nums.get(j) + " = " + sum);
            }
        }
    }

    private static int busquedaBinariaR(List<Integer> a, int e, int index, int i, int j) {
        if(a.get(index) == e) {
            return index;
        }
        if(i > j) {
            return -1;
        }

        if(a.get(index) > e) {
            j = index -1;
            return busquedaBinariaR(a, e, (j-i)/2, i, j);
        }else {
            i = index +1;
            return busquedaBinariaR(a, e, (j+i)/2, i, j);
        }
    }

    public static int binarySearch(List<Integer> a, int e) {
        int j = a.size()-1;
        return busquedaBinariaR(a, e,j/2,0,j);
    }
}
