import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        n = scan.nextInt();

        double sonuc = 0.0;

        for(double i=1; i<=n; i++) {
            sonuc += (1/i);
        }


        System.out.println("Sonuc : "+sonuc);

    }
}