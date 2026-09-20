import java.util.Scanner;

public class HW01c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bread type white (w or W) or sweet (s or S): ");
        char breadType = sc.next().charAt(0); 

        System.out.print("Is loaf double (y or n)? ");
        char loadSize = sc.next().charAt(0);

        System.out.print("Is baking manual (y or n)? ");
        char bakingType = sc.next().charAt(0);

        if (breadType != 'w' && breadType != 'W' && breadType != 's' && breadType != 'S') {
            System.out.println("Invalid bread type. Please enter 'w' or 'W' for white bread, or 's' or 'S' for sweet bread.");
            return;
        }
        if (loadSize != 'y' && loadSize != 'Y' && loadSize != 'n' && loadSize != 'N') {
            System.out.println("Invalid loaf size. Please enter 'y' or 'Y' for double or 'n' or 'N' for single.");
            return;
        }
        if (bakingType != 'y' && bakingType != 'Y' && bakingType != 'n' && bakingType != 'N') {
            System.out.println("Invalid baking type. Please enter 'y' or 'Y' for manual or 'n' or 'N' for automatic.");
            return;
        }
        int primaryKneading, secondaryKneading, secondaryRising, baking;

        if (breadType == 'w' || breadType == 'W') {
            primaryKneading = 15;
            secondaryKneading = 18;
            secondaryRising = 20;
            baking = 45;
        } else {
            primaryKneading = 20;
            secondaryKneading = 33;
            secondaryRising = 30;
            baking = 35;
        }
        // these are the same for both bread types
        int primaryRising = 60;
        int loafShaping = 2; // seconds
        int finalRising = 75;
        int cooling = 30;

        double bakingSeconds = 0;
        if (loadSize == 'y' || loadSize == 'Y') {
            double bakingDouble = baking * 1.5;
            int bakingMins = (int) bakingDouble;
            bakingSeconds = (bakingDouble - bakingMins) * 60;
           baking = bakingMins;
        }
        System.out.println("\nBaking process:");
        System.out.println("Primary kneading: " + primaryKneading + " minutes");
        System.out.println("Primary rising: " + primaryRising + " minutes");
        System.out.println("Secondary kneading: " + secondaryKneading + " minutes");
        System.out.println("Secondary rising: " + secondaryRising + " minutes");
        System.out.println("Loaf shaping: " + loafShaping + " seconds");

        if (bakingType == 'y' || bakingType == 'Y') {
            System.out.println("You should remove the dough for manual baking.");
        } else {
            if (bakingSeconds > 0) {
                System.out.println("Baking: " + baking + " minutes and " + (int) bakingSeconds + " seconds");
            } else {
                System.out.println("Baking: " + baking + " minutes");
            }
            System.out.println("Final rising: " + finalRising + " minutes");
            System.out.println("Cooling: " + cooling + " minutes");


        }
        int totalMins;
        int totalSeconds = 2; // load shaping is always 2 seconds

        if (bakingType == 'y' || bakingType == 'Y') {
            totalMins = primaryKneading + primaryRising + secondaryKneading + secondaryRising;
        } else {
            totalMins = primaryKneading + primaryRising + secondaryKneading + secondaryRising + finalRising + baking + cooling;
            totalSeconds += (int) bakingSeconds;
        }
        System.out.println("Total bakingtime: " + totalMins + " minutes and " + totalSeconds + " seconds");
    }
}