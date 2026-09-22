import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.0; // Initial balance
        int choice;

        do {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.printf("Your current balance is: $%,.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        // Deposit
                        System.out.printf("Deposited: $%,.2f%n", depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        // Withdraw
                        System.out.printf("Withdrew: $%,.2f%n", withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
                choice = 0; // Reset choice to continue the loop
            }
            
        } while (choice != 4);
    }
}