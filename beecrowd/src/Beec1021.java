import java.io.IOException;
import java.util.Scanner;

public class Beec1021 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        int remaining = (int) N;

        for (int note : notes) {
            int count = remaining / note;
            remaining = remaining % note;
            System.out.printf("%d nota(s) de R$ %d.00%n", count, note);
        }

        System.out.println("MOEDAS:");
        double remainingCoins = N - (int) N;
        remainingCoins = Math.round(remainingCoins * 100.0) / 100.0;

        // Обработка 1-реаловой монеты отдельно
        System.out.printf("%d moeda(s) de R$ 1.00%n", remaining);

        for (int i = 1; i < coins.length; i++) { // пропускаем 1.00
            int count = (int)(remainingCoins / coins[i]);
            remainingCoins -= count * coins[i];
            remainingCoins = Math.round(remainingCoins * 100.0) / 100.0; // корректируем погрешность
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coins[i]);
        }

        sc.close();
    }
}
