import java.io.IOException;
import java.util.Scanner;

public class Beec1043 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Проверка, можно ли составить треугольник
        if (A + B > C && A + C > B && B + C > A) {
            double perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }
}
