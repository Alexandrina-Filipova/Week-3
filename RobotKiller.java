import java.util.Random;
import java.util.Scanner;
public class RobotKiller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int countHits = 4;
        do {
            // Navigation
            System.out.println("Enter object in front of the Robot:  ");
            String objects = scanner.nextLine();

            if (objects.equals("Wall")) {
                System.out.println("Go Sideway");
            } else if (objects.equals("Chair")) {
                System.out.println("Jump");
            } else if (objects.equals("None")) {
                System.out.println("Forward");
            }

            // Finding Objects
            System.out.println("Enter pixels: ");
            int pixels = scanner.nextInt();
            scanner.nextLine();

            if (pixels % 2 == 0) {
                System.out.println("Robot is ready to kill!");
                // Killing the mouse or destroying the furniture
                int fatalHit = rand.nextInt(10)+1;

                if (fatalHit != 5) {
                    System.out.println("Kill the mouse!");

                    // Communication
                    for (int i = 10; i > 0; i--) {
                        if (i % 2 == 0) {
                            System.out.println("I am a Robot!!!!!" + " " + i);
                        }
                    }
                } else {
                    System.out.println("Destroy the furniture!");
                    break;
                }
                countHits--;
            } else {
                System.out.println("Continue with searching!");
                continue;
            }

            int firstElectricityNumber  = rand.nextInt(1000)+1;
            int secondElectricityNumber = rand.nextInt(1000)+1;

            do {
                if (countHits == 0) {
                    firstElectricityNumber = rand.nextInt(1000)+1;
                    secondElectricityNumber = rand.nextInt(1000)+1;
                    if (firstElectricityNumber > secondElectricityNumber) {
                        System.out.println("There is electricity!");
                        countHits = 4;
                    } else if (firstElectricityNumber < secondElectricityNumber) {
                        System.out.println("There is no electricity!");
                        break;
                    }
                }
            } while (firstElectricityNumber == secondElectricityNumber);
//             else {
//                System.out.println("Try again!");
//            }
        } while (countHits > 0);
    }
}