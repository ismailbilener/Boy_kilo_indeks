import java.sql.SQLOutput;
import java.util.Scanner;
public class BedenKitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("boyunuzu m olarak giriniz");
        double boy = input.nextDouble();

        System.out.println("kilonuzu kg olarak girin");
        double kilo = input.nextDouble();

        double indeks = kilo/(boy*boy);
        System.out.println(indeks);
    }
}
