import java.io.IOException;
import java.util.Scanner;

public class Beec1038 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // код товара
        int Y = sc.nextInt(); // количество

        double price = 0.0;

        switch (X) {
            case 1: price = 4.0; break;
            case 2: price = 4.5; break;
            case 3: price = 5.0; break;
            case 4: price = 2.0; break;
            case 5: price = 1.5; break;
            default: price = 0.0; break; // на случай неверного кода
        }

        double total = Y * price;

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
