import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number:");
        int num=in.nextInt();
        int square;
        int cube;
        square=num*num;
        cube=num*num*num;
        System.out.println(square);
        System.out.println(cube);
        System.out.println(Math.pow(num,4));

    }
}
