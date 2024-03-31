import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int d,m;

        System.out.println("BURC BULMA PROGRAMI: \n ------------------");
        System.out.print("dogdugunuz gunu giriniz : ");
        d = scan.nextInt();
        System.out.print("dogdunuz ayi giriniz : ");
        m = scan.nextInt();

        if(m == 1) {
            if(d >= 1 && d <= 31) {
                if(d < 22) {
                    System.out.println("BURC : OGLAK");
                }
            }
            else {
                System.out.println("BURC : KOVA");
            }

        }


        if(m == 2) {
            if(d >= 1 && d <= 29) {
                if(d < 20) {
                    System.out.println("BURC : KOVA");
                }
                else {
                    System.out.println("BURC : BALIK");
                }
            }
        }

        if(m == 3) {
            if(d >= 1 && d <= 31) {
                if(d < 21) {
                    System.out.println("BURC : BALIK");
                }
                else {
                    System.out.println("BURC : KOC");
                }
            }
        }


        if(m == 4) {
            if(d >=1 && d <= 30) {
                if(d < 20) {
                    System.out.println("BURC : KOC");
                }
                else {
                    System.out.println("BURC : BOGA");
                }
            }
        }

        if(m == 5) {
            if(d >= 1 && d <= 31) {
                if(d < 21) {
                    System.out.println("BURC : BOGA");
                }
                else {
                    System.out.println("BURC : IKIZLER");
                }
            }
        }

        if(m == 6) {
            if(d >= 1 && d <= 30) {
                if(d < 22) {
                    System.out.println("BURC : IKIZLER");
                }
                else {
                    System.out.println("BURC : YENGEC");
                }
            }
        }

        if(m == 7) {
            if(d >= 1 && d <= 31) {
                if(d < 22) {
                    System.out.println("BURC : YENGEC");
                }
                else {
                    System.out.println("BURC : ASLAN");
                }
            }
        }

        if(m == 8) {
            if(d >= 1 && d <= 30) {
                if(d < 22) {
                    System.out.println("BURC : ASLAN");
                }
                else {
                    System.out.println("BURC : BASAK");
                }
            }
        }

        if(m == 9) {
            if(d >= 1 && d <= 31) {
                if(d < 22) {
                    System.out.println("BURC : BASAK");
                }
                else {
                    System.out.println("BURC : TERAZI");
                }
            }
        }

        if(m == 10) {
            if(d >= 1 && d <= 31) {
                if(d < 22) {
                    System.out.println("BURC : TERAZI");
                }
                else {
                    System.out.println("BURC : AKREP");
                }
            }
        }

        if(m == 11) {
            if(d >= 1 && d <= 30) {
                if(d < 21) {
                    System.out.println("BURC : AKREP");
                }
                else {
                    System.out.println("BURC : YAY");
                }
            }
        }

        if(m == 12) {
            if(d >= 1 && d <= 31) {
                if(d < 21) {
                    System.out.println("BURC : YAY");
                }
                else {
                    System.out.println("BURC : OGLAK");
                }
            }
        }


        if(m < 0 && m > 12) {
            System.out.println("HATALI TUSLAMA TEKRAR DENEYİN!");
        }


        }
    }
