import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n,n1=0,n2=1,total;

        System.out.print("Sayi giriniz : ");
        n = scan.nextInt();

        System.out.print("Girilen sayinin fibonacci serisi : ");
        for(int i=1;i<=n;i++) {
            System.out.println(n1+" , ");
            total = n1+n2;
            n1 = n2;
            n2 = total;
        }

    }
}