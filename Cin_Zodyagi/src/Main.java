import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int brday;

        System.out.print("Dogum yilinizi giriniz : ");
        brday = scan.nextInt();

        if(brday % 12 == 0) {
            System.out.println("Cin Zodyagi : Maymun");
        }
        else if(brday %12 == 1) {
            System.out.println("Cin Zodyagi : Horoz");
        }
        else if(brday %12 == 2) {
            System.out.println("Cin Zodyagi : Kopek");
        }
        else if(brday %12 == 3) {
            System.out.println("Cin Zodyagi : Domuz");
        }
        else if(brday %12 == 4) {
            System.out.println("Cin Zodyagi : Fare");
        }
        else if(brday %12 == 5) {
            System.out.println("Cin Zodyagi : Okuz");
        }
        else if(brday %12 == 6) {
            System.out.println("Cin Zodyagi : Kaplan");
        }
        else if(brday %12 == 7) {
            System.out.println("Cin Zodyagi : Tavsan");
        }
        else if(brday %12 == 8) {
            System.out.println("Cin Zodyagi : Ejderha");
        }
        else if(brday %12 == 9) {
            System.out.println("Cin Zodyagi : Yilan");
        }
        else if(brday %12 == 10) {
            System.out.println("Cin Zodyagi : At");
        }
        else if(brday %12 == 11) {
            System.out.println("Cin Zodyagi : Koyun");
        }




    }
}