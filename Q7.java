import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=in.nextInt();
        int num2= in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum="+sum);
        if (num1>num2) System.out.println(num1+">"+num2);
        if (num2>num1)System.out.println(num2+">"+num1);
        if (num1==num2) System.out.println(num1+"="+num2);
        System.out.println("The product="+num1*num2);
        int max;
        if (num1>num2) {
            max = num1;
            System.out.println(num1 + "Is the maximum numbers");
        }
        else if (num2>num1)
        {
            max=num2;
            System.out.println(num2+"  Is the maximum numbers");

        }
        else System.out.println("The two numbers are equal");

    }
}
