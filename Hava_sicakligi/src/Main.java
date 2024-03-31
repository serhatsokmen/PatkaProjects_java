import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hSicakligi;

        System.out.print("Hava kac derece? " );
        hSicakligi = scan.nextInt();

        if(hSicakligi < 5) {
            System.out.println("kayak yapmak icin guzel bir gun.");
        }
        else if(hSicakligi <= 15 && hSicakligi >= 5) {
            System.out.println("bugün sinemaya gitmek icin guzel bir gun.");
        }
        else if(hSicakligi <= 25 && hSicakligi >= 10) {
            System.out.println("sinemaya da gidebilirsiniz fakat piknik icin daha guzel bir hava");
        }
        else if(hSicakligi > 25) {
            System.out.println("Bugun kesinlikle yuzmeye gitmelisin.");
        }



    }
}