import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW01a {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\Code\\Uni-code\\scores.txt");
            FileOutputStream fos = new FileOutputStream("E:\\Code\\Uni-code\\output.txt");
            Scanner sc = new Scanner(fis);
            PrintWriter pw = new PrintWriter(fos);
            double totalq1 = 0, totalq2 = 0, totalq3 = 0, totalq4 = 0, totalq5 = 0;
            int count = 0;
            while (sc.hasNextDouble()) {
                totalq1 += sc.nextDouble();
                totalq2 += sc.nextDouble();
                totalq3 += sc.nextDouble();
                totalq4 += sc.nextDouble();
                totalq5 += sc.nextDouble();
                count++;

            }
            pw.printf("Average for Q1: %.2f%n", (totalq1 / count));
            pw.printf("Average for Q2: %.2f%n", (totalq2 / count));
            pw.printf("Average for Q3: %.2f%n", (totalq3 / count));
            pw.printf("Average for Q4: %.2f%n", (totalq4 / count));
            pw.printf("Average for Q5: %.2f%n", (totalq5 / count));
            pw.close();

        } catch (Exception e) {
            System.out.println("Error opening file...");
        }
    }
}