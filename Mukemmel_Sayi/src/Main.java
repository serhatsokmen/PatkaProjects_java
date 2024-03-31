import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n,msayi=0;
        System.out.println("Bir sayi giriniz : ");
        n = scan.nextInt();

        for(int i=1;i<n;i++) {
            if(n % i == 0) {
                msayi += i;
            }
        }

        if(msayi == n) {
            System.out.println("girdiginiz sayi mukemmel sayidir.");
        }
        else {
            System.out.println("Girdiginiz sayi mukemmel sayi degildir.");
        }

    }
}