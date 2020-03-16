package lecture1;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args)
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        b = scanner.nextInt();
        int sum = a + b;
        int product = a*b;
        System.out.println("The sum of " + a + " + " + b + " is " + sum);
        System.out.println("The product is " + a + " * " + b + " is " + product);
    }
}
