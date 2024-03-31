import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        double r, pi = 3.14;

        System.out.print("Yaricap (r) giriniz : ");
        r = scan.nextDouble();

        System.out.print("Merkez acisinin olcusunu (a) giriniz : ");
        a = scan.nextInt();

        double alan = (pi * (r*r) * a) / 360;

        System.out.println("Daire Diliminin Alani : "+alan);


    }
}