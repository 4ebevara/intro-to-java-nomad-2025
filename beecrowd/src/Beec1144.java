import java.io.IOException;
import java.util.Scanner;

public class Beec1144 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // первая строка
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            // вторая строка
            System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
        }

        sc.close();
    }
}
