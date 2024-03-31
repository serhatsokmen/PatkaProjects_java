import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size;

        System.out.print("dizinin boyutu : ");
        size = scan.nextInt();

        int[] list = new int[size];

        for(int i=0;i<list.length;i++) {
            System.out.print((i+1)+". elemani : ");
            list[i] = scan.nextInt();
        }

        System.out.println("ARRAY : ");
        System.out.print("Siralama : ");
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println("**************");
        System.out.print("dizinin siralanmis hali : ");
        System.out.println(Arrays.toString(list));







    }
}