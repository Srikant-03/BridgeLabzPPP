import java.util.*;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent:");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        sc.close();
    }
}
