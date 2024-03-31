import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double boy,kilo;

        System.out.print("Metre cinsinden boyunuzu giriniz : ");
        boy = scan.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        double indeks = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz : "+indeks);


    }
}