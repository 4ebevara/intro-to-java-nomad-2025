import java.io.IOException;
import java.util.Scanner;

public class Beec1017 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();       // время в пути
        int speed = sc.nextInt();       // средняя скорость в км/ч

        double distance = hours * speed;     // пройденное расстояние
        double fuelNeeded = distance / 12.0; // расход топлива 12 км/л

        System.out.printf("%.3f%n", fuelNeeded);

        sc.close();
    }
}
