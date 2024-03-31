import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double KDV = 0.18;
        double tutar;
        System.out.print("Ucret tutarini girin : ");
        tutar = scan.nextDouble();
        double KDVtutari = tutar * KDV;

        System.out.println("KDV fiyati : "+KDVtutari);
        System.out.println("KDV dahil toplam fiyat : "+(tutar+KDVtutari));


    }
}