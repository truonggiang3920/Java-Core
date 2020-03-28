package lecture3_array_string_enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args)
    {
        int one, two, three, four, five, six, seven, eight, night, ten;
        int leght = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element: ");
        one = scanner.nextInt();
        two = scanner.nextInt();
        three = scanner.nextInt();
        four = scanner.nextInt();
        five = scanner.nextInt();
        six = scanner.nextInt();
        seven = scanner.nextInt();
        eight = scanner.nextInt();
        night = scanner.nextInt();
        ten = scanner.nextInt();
        int myArray [] = new int[10];
        myArray[0] = one;
        myArray[1] = two;
        myArray[2] = three;
        myArray[3] = four;
        myArray[4] = five;
        myArray[5] = six;
        myArray[6] = seven;
        myArray[7] = eight;
        myArray[8] = night;
        myArray[9] = ten;
        for(int index = 0; index <= myArray.length; index++)
        {
            for (int array : myArray)
            {
            }
        }
    }
}
