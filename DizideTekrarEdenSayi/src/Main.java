import java.util.*;
public class Main {



    public static void main(String[] args) {

        int[] n = {2,7,2,2,2,9,10,21,1,56,8,5};
        System.out.println(Arrays.toString(n));

        Arrays.sort(n);

        System.out.print(Arrays.toString(n));

        int sayac=0;

        for(int i=0;i<n.length;i++) {
            if(n[i] == n[i+1]) {
                int en = n[i];
                if(en % 2 == 0) {
                    sayac++;
                    System.out.println(en+" ");
                }
            }
        }


        if(sayac == 0) {
            System.out.println("----");
        }


    }
}