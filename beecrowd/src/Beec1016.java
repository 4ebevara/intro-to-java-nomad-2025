import java.io.IOException;
import java.util.Scanner;

public class Beec1016 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt(); // расстояние в км

        // Так как Y "догоняет" X со скоростью 30 км/ч
        int timeMinutes = (distance * 60) / 30;

        System.out.printf("%d minutos%n", timeMinutes);

        sc.close();
    }
}

