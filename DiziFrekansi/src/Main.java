import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //int size;


/*
        System.out.println("Dizi boyutu : ");
        size = scan.nextInt();
        int[] list = new int[size];
        for(int i=0;i<list.length;i++) {
            System.out.print((i+1)+". Eleman : ");
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Olusturulan Dizi : "+Arrays.toString(list));

        int sayac = 1;

        for(int i=0;i<list.length;i++) {

            if(i == 0) {
                for(int j=0;j<list.length;j++) {
                    if((i != j) && (list[i] == list[j])) {
                        sayac++;
                    }
                }
                System.out.println(list[i]+" sayisi "+sayac+" kere tekrar etti.");
            }
            else if(list[i] != list[i-1]) {
                for(int j=0;j<list.length;j++) {
                    if((i != j) && (list[i] == list[j])) {
                        sayac++;
                    }
                }
                System.out.println(list[i]+" sayisi "+sayac+" kere tekrar etti.");
            }

            sayac = 1;

        }

*/





        /*
        * kullanıcıdan alınan verilere göre dizi oluşturma
        * oluşturlan dizide hangi elemanların kaç kere tekrar ettiğini yazdırma.
        * */


        int size;

        System.out.println("Dizi boyutu : ");
        size = scan.nextInt();
        int[] list = new int[size];
        for(int i=0;i<list.length;i++) {
            System.out.print((i+1)+". Eleman : ");
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Olusturulan Dizi : "+Arrays.toString(list));

        int counter = 1; // tekrar edecek olan sayıları tutmak için bir sayaç oluşturduk.

        for(int i=0;i<list.length;i++) {
            if(i == 0) {
                for(int j=0;j<list.length;j++) {
                    if((i != j) && (list[i] == list[j])) { // i, j'ye eşit olmadığı halde dizinin i. elemanı ile j. elemanı eşit olursa sayacı 1 arttır.
                        counter++; // yani aslında aynı sayı farklı bir indekste de varsa o sayıyı sayaca at ve sayacın değerini 1 arttır.
                    }
                }
                System.out.println(list[i]+" sayisi "+counter+" kere tekrar etti."); // hangi sayının kaç kere tekrar ettiğini yaz.
            }
            else if(list[i] != list[i-1]) { // eğer list dizisindeki eleman bir önceki eleman ile eşit değilse
                for(int j=0;j<list.length;j++) {
                    if((i != j) && (list[i] == list[j])) { // buradaki kullanım 78. satırda anlatıldı.
                        counter++;
                    }
                }
                System.out.println(list[i]+" sayisi "+counter+" kere tekrar etti.");
            }
            counter = 1;
        }


        // kod sıkıntısız bir şekilde çalışmakta.
        // kullanıcıdan alınan veriler ile birlikte oluşturulan dizide, hangi elemanın kaç kere tekrar ettiğini bulduk.






























    }
}