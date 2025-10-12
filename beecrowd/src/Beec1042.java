import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Beec1042 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Сохраняем исходный порядок
        int[] original = {a, b, c};
        // Создаём массив для сортировки
        int[] sorted = {a, b, c};
        Arrays.sort(sorted);

        // Выводим отсортированные числа
        for (int num : sorted) {
            System.out.println(num);
        }

        System.out.println(); // Пустая строка

        // Выводим числа в исходном порядке
        for (int num : original) {
            System.out.println(num);
        }

        sc.close();
    }
}
