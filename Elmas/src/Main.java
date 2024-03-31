import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int satir;

        System.out.println("Satir sayisi : ");
        satir = scan.nextInt();

        for(int i=1; i<=satir;i++) {
            for(int j=i;j<=satir;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=satir;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=satir;j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}