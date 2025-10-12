import java.io.IOException;
import java.util.Scanner;

public class Beec1020 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        sc.close();
    }
}
