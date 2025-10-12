import java.io.IOException;
import java.util.Scanner;

public class Beec1019 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // количество секунд

        int hours = N / 3600;
        int minutes = (N % 3600) / 60;
        int seconds = N % 60;

        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

        sc.close();
    }
}
