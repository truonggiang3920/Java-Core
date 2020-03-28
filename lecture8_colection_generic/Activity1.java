package lecture8_colection_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one: ");
        String one = scanner.nextLine();
        System.out.print("Input two: ");
        String two = scanner.nextLine();
        System.out.print("Input three: ");
        String three = scanner.nextLine();
        System.out.print("Input four: ");
        String four = scanner.nextLine();
        System.out.print("Input five: ");
        String five = scanner.nextLine();

        List<String> arrayList = new ArrayList<>();
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.add(five);
        System.out.println(arrayList);
        System.out.println("----------------");

        System.out.print("Enter the text you want to add: ");
        String text = scanner.nextLine();
        System.out.print("Enter the location you want to add: ");
        int location = scanner.nextInt();
        arrayList.add(location, text);
        System.out.println(arrayList);
    }
}
