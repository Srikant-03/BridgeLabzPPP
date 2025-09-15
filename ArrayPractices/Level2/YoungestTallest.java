import java.util.*;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = in.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = in.nextDouble();
        }

        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
            if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
        }

        System.out.println("Youngest is " + names[minAgeIndex]);
        System.out.println("Tallest is " + names[maxHeightIndex]);
        in.close();
    }
}
