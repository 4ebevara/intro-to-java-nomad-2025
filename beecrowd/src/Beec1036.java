import java.io.IOException;
import java.util.Scanner;

public class Beec1036 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = B * B - 4 * A * C;
            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                double R1 = (-B + Math.sqrt(delta)) / (2 * A);
                double R2 = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.printf("R1 = %.5f%n", R1);
                System.out.printf("R2 = %.5f%n", R2);
            }
        }

        sc.close();
    }
}
