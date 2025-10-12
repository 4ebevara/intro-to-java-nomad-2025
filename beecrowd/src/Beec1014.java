import java.io.IOException;
import java.util.Scanner;

public class Beec1014 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();      // Пройденное расстояние в км
        double fuel = sc.nextDouble();    // Потраченное топливо в литрах

        double consumption = distance / fuel;  // Средний расход

        System.out.printf("%.3f km/l%n", consumption);

        sc.close();
    }
}
