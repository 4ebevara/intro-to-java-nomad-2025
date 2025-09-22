public class Problem11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;

        int secondsPerYear = 365 * 24 * 60 * 60;
        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        int populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += populationChangePerYear;
            System.out.println("Year " + i + " population: " + currentPopulation);
        }
    }
}
