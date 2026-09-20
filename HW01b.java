import java.util.Scanner;

public class HW01b {
    public double practiceOverloadedMethod(double r) {
        return Math.PI * r * r;
    }
    public double practiceOverloadedMethod(String s){
        Scanner sc = new Scanner(s);
        double num1 = sc.nextDouble();
        String operator = sc.next();
        double num2 = sc.nextDouble();

        if (operator.equals("plus")) {
            return num1 + num2;
        } else if (operator.equals("minus")) {
            return num1 - num2;
        } else {
            return 0.0;
        }
    }
    public double[] practiceOverloadedMethod(double m1, double b1, double m2, double b2) {
    if (m1 == m2) {
        return new double[]{-999, -999};
    } else {
        double x = (b2 - b1) / (m1 - m2);
        double y = m1 * x + b1;
        return new double[]{x, y};
    }
}

    public static void main(String[] args) {
        HW01b obj = new HW01b();

        double[] result1 = obj.practiceOverloadedMethod(1.5, 3.9, 2.4, 6.3);
        double result2 = obj.practiceOverloadedMethod(2.5);
        double result3 = obj.practiceOverloadedMethod("2 plus 5");
        double result4 = obj.practiceOverloadedMethod("23 minus 19");

        if (result1[0] == result1[1] && result1[1] == -999) {
            System.out.println("The two lines are parallel.");
        } else {
            System.out.println("The result is: " + String.format("%,.2f", result1[0]) + "," + String.format("%,.2f", result1[1]));
        }
        System.out.println("The result is: " + String.format("%,.2f", result2));
        System.out.println("The result is: " + String.format("%,.2f", result3));
        System.out.println("The result is: " + String.format("%,.2f", result4));
    }
}
