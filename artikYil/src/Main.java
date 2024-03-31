import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year;
        System.out.print("yil giriniz : ");
        year = scan.nextInt();

        if((year %4 == 0 && year %100 != 0) || (year %400 == 0)) {
            System.out.println(year+" Artik Yildir.");
        }
        else {
            System.out.println(year+" Artik Yil Degildir.");
        }






    }
}