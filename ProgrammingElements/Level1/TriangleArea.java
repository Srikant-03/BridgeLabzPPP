import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The area of the triangle in sq cm is " + areaCm + " and in sq inches is " + areaIn);

        sc.close();
    }
}
