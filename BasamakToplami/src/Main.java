import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int n;

        n = scan.nextInt();

        int temp = n;
        int top = 0;


        while(n > 0) {
            top += n%10;
            n /= 10;
        }

        System.out.println("Girilen sayisinin rakamlari toplami : "+top);

    }
}