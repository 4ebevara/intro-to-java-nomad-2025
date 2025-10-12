import java.io.IOException;
import java.util.Scanner;

public class Beec1008 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valuePerHour = sc.nextDouble();

        double salary = hours * valuePerHour;

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
