import java.io.IOException;
import java.util.Scanner;

public class Beec1018 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int remaining = N;

        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(N);

        for (int note : notes) {
            int count = remaining / note;
            remaining = remaining % note;
            System.out.printf("%d nota(s) de R$ %d,00%n", count, note);
        }

        sc.close();
    }
}
