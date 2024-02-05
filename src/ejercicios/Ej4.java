package ejercicios;
import java.io.StringBufferInputStream;

public class Ej4 {
    public static void main(String args[]) {
        int n = 195;
        int sumas = 0;
        String s = Integer.toString(n);
        StringBuffer pali = new StringBuffer(s);

        while (!s.equals(new StringBuffer(s).reverse().toString())) {
            String s1 = pali.toString();
            String s2 = new StringBuffer(s1).reverse().toString();
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            int r = n1 + n2;
            String pal = Integer.toString(r);

            pali.delete(0, pali.length());
            pali.insert(0, pal);

            s = pal;
            sumas++;
        }

        System.out.println(pali);
        System.out.println(sumas);
    }
}

