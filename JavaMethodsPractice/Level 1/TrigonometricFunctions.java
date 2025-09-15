import java.util.Scanner;

class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + results[0]);
        System.out.println("Cos: " + results[1]);
        System.out.println("Tan: " + results[2]);
    }
}
