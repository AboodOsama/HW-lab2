import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int sum;
        sum=x+y+z;
        System.out.println("The sumation="+sum);
        System.out.println("The average="+sum/3);

    }
}
