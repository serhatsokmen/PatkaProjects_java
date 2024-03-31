import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int[] list = {15,12,788,1,-1,-778,2,0};


        System.out.println(Arrays.toString(list));

        int max,min;

        System.out.print("sayi giriniz : ");
        int n = scan.nextInt();

        max = n;
        min = n;

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for(int bul : list) {
            if(bul > n) {
                max = bul;
                break;
            }
        }

        for(int i=list.length-1;i >= 0;i--) {
            if(list[i] < n) {
                min = list[i];
                break;
            }
        }

        System.out.println("girilen sayidan kucuk en buyuk deger : "+min);
        System.out.println("girilen sayidan buyuk en kucuk deger  :"+max);


    }
}