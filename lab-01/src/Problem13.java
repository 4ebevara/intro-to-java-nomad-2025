public class Problem13 {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55;
        double e = 44.5, f = 5.9;

        double denominator = a * d - b * c;

        if (denominator != 0) {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
