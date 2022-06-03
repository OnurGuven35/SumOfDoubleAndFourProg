import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        int total = 0;

        do {
            System.out.print("Lutfen Bir Sayi Giriniz : ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.print("Girilen Degerlerden Cift ve 4'un Katlarinin Toplami : " + total);

    }
}
