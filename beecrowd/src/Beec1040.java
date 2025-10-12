import java.io.IOException;
import java.util.Scanner;

public class Beec1040 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        // Средневзвешенная оценка
        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10.0;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            // Случай "Aluno em exame."
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exame);

            double mediaFinal = (media + exame) / 2.0;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        sc.close();
    }
}
