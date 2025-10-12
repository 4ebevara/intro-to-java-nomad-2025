import java.io.IOException;
import java.util.Scanner;

public class Beec1011 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;

        double volume = (4.0 / 3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
