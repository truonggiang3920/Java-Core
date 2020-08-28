package lecture8_colection_generic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first element: ");
        String first = scanner.nextLine();
        System.out.println("Enter the second element: ");
        String second = scanner.nextLine();
        List <String> items = new ArrayList<>();
        items.add(first);
        items.add(second);
        System.out.println("Enter the location you want to delete the element: ");
        int location = scanner.nextInt();
        items.remove(location);
        System.out.println(items);

    }
}
