import java.io.IOException;
import java.util.Scanner;

public class Beec1009 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        double totalSalary = fixedSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);

        sc.close();
    }
}
