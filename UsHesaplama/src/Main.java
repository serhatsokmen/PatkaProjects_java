import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1,n2,carp=1;

        System.out.print("Ussu alinacak sayiyi giriniz : ");
        n1 = scan.nextInt();

        System.out.print("Us olacak sayiyi giriniz : ");
        n2 = scan.nextInt();

        for(int i=1; i<=n2; i++) {
            carp *= n1;
        }

        System.out.println("CEVAP : "+carp);


    }
}