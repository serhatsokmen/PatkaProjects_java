import java.util.*;
public class Main {


    public static void Desen(int n) {
        int new_n = n;
        System.out.print("Cikti : " +n);

        for(int i=n;i>0;i-=5) {
            new_n -= 5;
            System.out.println(new_n+ " ");
        }

        int old_n = new_n;

        for(int i=new_n;i<n;i+=5) {
            old_n+=5;
            System.out.print(old_n+ " ");
        }

    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi girin : ");
        number = scan.nextInt();

        Desen(number);

    }
}