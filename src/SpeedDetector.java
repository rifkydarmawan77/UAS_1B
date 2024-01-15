import java.util.ArrayList;
import java.util.Random;

public class SpeedDetector {
    public static void main(String[] args) {
        ArrayList<Integer> speedsInRange = new ArrayList<>();
        ArrayList<Integer> speedsBelowRange = new ArrayList<>();

        detectSpeeds(speedsInRange, speedsBelowRange);

        System.out.println("Kendaraan dengan kecepatan antara 80 s/d 100 km/jam:");
        displaySpeeds(speedsInRange);

        System.out.println("\nKendaraan dengan kecepatan di bawah 80 km/jam:");
        displaySpeeds(speedsBelowRange);
    }

    private static void detectSpeeds(ArrayList<Integer> speedsInRange, ArrayList<Integer> speedsBelowRange) {
        int counter = 0;
        while (counter < 200) {
            int randomSpeed = generateRandomSpeed();
            if (randomSpeed >= 80 && randomSpeed <= 100) {
                speedsInRange.add(randomSpeed);
            } else {
                speedsBelowRange.add(randomSpeed);
            }
            counter++;
        }
    }

    private static int generateRandomSpeed() {
        Random rand = new Random();
        return rand.nextInt(121); // Generates a random number between 0 and 120 (inclusive)
    }

    private static void displaySpeeds(ArrayList<Integer> speeds) {
        for (int i = 0; i < speeds.size(); i++) {
            System.out.println("Kendaraan " + (i + 1) + ": " + speeds.get(i) + " km/jam");
        }
    }
}