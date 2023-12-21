import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x value: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter y value: ");
        double y = scanner.nextDouble();
        if (y == 5.0 / 2.0 * x + 8.5 || y == -2 || x == Math.pow(y - 2, 2) + 2) {
            System.out.println("Blue");
        } else if (x > Math.pow(y - 2, 2) + 2) {
            System.out.println("Orange");
        } else if (y > 5.0 / 2.0 * x + 8.5 && y < -2) {
            System.out.println("Green");
        } else if (y > -2) {
            System.out.println("Gray");
        } else {
            System.out.println("Yellow");
        }
    }
}
