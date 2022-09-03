import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height and the width:");
        double height = in.nextDouble();
        double width = in.nextDouble();
        double Area;
        System.out.println("The area=" + height * width);
        System.out.println("The Perimeter=" + 2 * height + 2 * width);
    }
}
