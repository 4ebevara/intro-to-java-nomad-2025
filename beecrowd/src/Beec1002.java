import java.io.IOException;
import java.util.Scanner;

public class Beec1002 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;
        double A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
