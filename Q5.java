import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=in.nextInt();
        int y=in.nextInt();
        int a;
        a=x;
        x=y;
        y=a;
        System.out.println("The value of x="+x);
        System.out.println("The value of y="+y);

    }
}
