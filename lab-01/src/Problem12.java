public class Problem12 {
    public static void main(String[] args) {
        double distanceKm = 24.0;

        double hours = 1.0 + 40.0 / 60.0 + 35.0 / 3600.0; // 1 час, 40 минут, 35 секунд
        double speed = distanceKm / hours;

        System.out.println("Average speed in kilometers per hour = " + speed);
    }
}
