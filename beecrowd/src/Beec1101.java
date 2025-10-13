import java.io.IOException;
import java.util.Scanner;

public class Beec1101 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            // условие выхода
            if (m <= 0 || n <= 0) {
                break;
            }

            int start = Math.min(m, n);
            int end = Math.max(m, n);
            int sum = 0;

            // вывод чисел и подсчет суммы
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("Sum=" + sum);
        }

        sc.close();
    }
}
