public class Problem10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double timeInHours = (45.0 * 60 + 30) / 3600.0; // 45 минут 30 секунд в часах
        double speed = miles / timeInHours;

        System.out.println("Average speed in miles per hour = " + speed);
    }
}
