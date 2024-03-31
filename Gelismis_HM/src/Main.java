import java.util.*;
public class Main {

    Scanner scan = new Scanner(System.in);
    static int Toplam(int a, int b) {
        int result = a+b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int Cikar(int a, int b) {
        int result = a-b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int Carp(int a, int b) {
        int result = a*b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static double Bolme(double a, double b) {
        double result = a/b;
        System.out.println("sonuc : "+result);
        return result;
    }

    static int UsHesabi(int a, int b) {
        int result=1,i;
        for(i=1;i<=b;i++) {
            result *= a;
        }
        System.out.println("sonuc : "+result);
        return result;
    }

    static int Mod(int a, int b) {
        int result = a%b;
        System.out.println("sonuc : "+result);
        return result;
    }

    static int D_alan(int a, int b) {
        int result = a*b;
        System.out.println("sonuc : "+result);
        return result;
    }

    static int D_cevre(int a, int b) {
        int result = (2*a)+(2*b);
        System.out.println("sonuc : "+result);
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("1 - Tolama İslemi\n2- Cikarma İslemi\n3- Carpma İslemi\n4- Bolme İslemi\n5- Uslu Sayi Hesaplama\n6- Mod Alma İSlemi\n7- Dikdortgen Alani Hesaplama\n8- Dikdortgen Cevresi Hesaplama\n0- Cikis Yap");
        System.out.println("***************************");
        int select;





            do{
                System.out.print("Yukaridaki menuye gore yapmak istediginiz islemi seciniz : ");
                select = scan.nextInt();

                if(select >= 0 && select <=7) {


                    int n1, n2;

                    switch (select) {
                        case 1:
                            System.out.print("1. sayi : ");
                            n1 = scan.nextInt();
                            System.out.print("2. sayi : ");
                            n2 = scan.nextInt();
                            Toplam(n1, n2);
                            break;

                        case 2:
                            System.out.print("1. sayi : ");
                            n1 = scan.nextInt();
                            System.out.print("2. sayi : ");
                            n2 = scan.nextInt();
                            Cikar(n1, n2);
                            break;

                        case 3:
                            System.out.print("1. sayi : ");
                            n1 = scan.nextInt();
                            System.out.print("2. sayi : ");
                            n2 = scan.nextInt();
                            Carp(n1,n2);
                            break;

                        case 4:
                            double s1,s2;
                            System.out.print("1. sayi : ");
                            s1 = scan.nextDouble();
                            System.out.print("2. sayi : ");
                            s2 = scan.nextDouble();
                            Bolme(s1,s2);
                            break;

                        case 5:
                            System.out.print("taban deger : ");
                            n1 = scan.nextInt();
                            System.out.print("us degeri : ");
                            n2 = scan.nextInt();
                            UsHesabi(n1,n2);
                            break;

                        case 6:
                            System.out.print("1. sayi : ");
                            n1 = scan.nextInt();
                            System.out.print("2. sayi : ");
                            n2 = scan.nextInt();
                            Mod(n1,n2);
                            break;

                        case 7:
                            System.out.print("uzun kenar : ");
                            n1 = scan.nextInt();
                            System.out.print("kisa kenar : ");
                            n2 = scan.nextInt();
                            D_alan(n1,n2);
                            break;

                        case 8:
                            System.out.println("uzun kenar : ");
                            n1 = scan.nextInt();
                            System.out.println("kisa kenar : ");
                            n2 = scan.nextInt();
                            D_cevre(n1,n2);
                            break;

                        case 0:
                            System.out.println("\n");
                            System.out.println("cikis yapiliyor...");

                    }

                }
                else {
                    System.out.println("Yanlis tuslama yaptiniz! Tekrar deneyiniz.");
                }

            }while(select != 0);


        }




    }
