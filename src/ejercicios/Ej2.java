package ejercicios;
import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    public static List<Integer> primos(int n) {
        List<Integer> primosList = new ArrayList<>();
        List<Integer> noPrimosList = new ArrayList<>();

        for (int i = 2; i < n + 1; i++) {
            if (!noPrimosList.contains(i)) {
                primosList.add(i);
                for (int j = i * i; j < n + 1; j += i) {
                    noPrimosList.add(j);
                }
            }
        }
        return primosList;
    }

    public static void main(String[] args) {
        List<Integer> list = primos(41);
        for (int num : list) {
            System.out.println(num);
        }
    }
}

