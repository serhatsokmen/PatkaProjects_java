import java.util.*;
public class Main {





    public static void main(String[] args) {

        int taban,us,i,sonuc=1;


        Scanner scan = new Scanner(System.in);
        System.out.print("taban degerini giriniz : ");
        taban = scan.nextInt();
        System.out.print("us degerini girin : ");
        us = scan.nextInt();

        for(i=1;i<=us;i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuc : "+sonuc);



        }
    }






