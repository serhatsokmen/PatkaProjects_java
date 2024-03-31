import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int deneme = 3,sec;
        int Bakiye = 1500;
        String nn,psw;


        while(deneme > 0) {
            System.out.print("Kullanici Adi : ");
            nn = scan.nextLine();
            System.out.print("Parola : ");
            psw = scan.nextLine();

            if(nn.equals("Patika") && psw.equals("Dev_Kodluyoruz123")) {
                System.out.println("Merhaba, Patika.dev Subesindeki Kodluyoruz bankasina Hos Geldiniz!");
                do {

                    System.out.println("1-PARA YATIRMA\n2-PARA CEKME\n3-BAKIYE SORGULAMA\n4- CIKIS YAP");
                    System.out.println("Yukardidaki menuden yapmak itediginiz islemi seciniz.");
                    sec = scan.nextInt();
                    switch (sec) {
                        case 1:
                            System.out.print("yatirilacak tutar : ");
                            int parayatir = scan.nextInt();
                            Bakiye += parayatir;
                            break;
                        case 2:
                            System.out.println("cekilecek tutar : ");
                            int paracek = scan.nextInt();
                            if(paracek > Bakiye) {
                                System.out.println("YETERSIZ BAKIYE!");
                            }
                            else {
                                Bakiye -= paracek;
                            }
                            break;
                        case 3:
                            System.out.println("HESAP BAKIYENİZ : "+Bakiye);
                            break;
                    }

                    }while(sec != 4);
                System.out.println("iyi gunler dileriz :) ");
                break;

            }
            else {
                deneme --;
                System.out.println("Hatali kullanici adi veya sifre, tekrar deneyin!");
                if(deneme == 0) {
                    System.out.println("Hesabiniz supheli duruma duserek bloke olmustur banka ile iletisime geciniz.");
                }
                else {
                    System.out.println("kalan deneme hakki : "+deneme);
                }

            }

        }

        }
    }
