import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int leng;
        System.out.print("dizinin uzunlugunu girin : ");
        leng = scan.nextInt();

        double dizi[] = new double[leng];

        System.out.println("dizinin elemanlarini girin :");
        for(int i=0;i<leng;i++) {
            dizi[i] = scan.nextInt();
        }

        double toplam = 0.0;
        for(int i=0;i<leng;i++) {
         toplam += 1.0 + dizi[i];
        }

        double harmonik = leng/toplam;
        System.out.println(harmonik);

    }
}