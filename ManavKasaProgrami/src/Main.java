import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;

        double armut, elma, domates, muz, patlican;

        System.out.print("Armut kac kilo ? : ");
        armut = scan.nextDouble();
        System.out.print("Elma kac kilo ? : ");
        elma = scan.nextDouble();
        System.out.print("Domates kac kilo ? : ");
        domates = scan.nextDouble();
        System.out.print("Muz kac kilo ? : ");
        muz = scan.nextDouble();
        System.out.print("Patlican kac kilo ? : ");
        patlican = scan.nextDouble();

        double ToplamTutar = (pear * armut) + (apple * elma) + (tomato * domates) + (banana * muz) + (eggplant * patlican);

        System.out.println("Toplam Tutar : "+ToplamTutar);



    }
}