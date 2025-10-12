import java.io.IOException;
import java.util.Scanner;

public class Beec1010 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int code1 = sc.nextInt();
        int quantity1 = sc.nextInt();
        double price1 = sc.nextDouble();

        int code2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double total = quantity1 * price1 + quantity2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
