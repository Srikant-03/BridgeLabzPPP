import java.util.Scanner;

class SpringSeasonChecker {
    public static boolean isSpring(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month > 3 && month < 6) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean spring = isSpring(month, day);
        if (spring)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
