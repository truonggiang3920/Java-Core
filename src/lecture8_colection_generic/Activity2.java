package lecture8_colection_generic;

import java.util.*;

public class Activity2 {
    public static void main(String[] args)
    {
        System.out.println("Test: ");
        for(int i = 1; i <= 10; i++)
        {
            List <Integer> arrayList = new ArrayList<>();
            for(int j = 1; j <= 10000; j++)
            {
                arrayList.add(i);
            }
            long startTime = System.nanoTime();
            arrayList.get(4400);
            arrayList.get(4600);
            arrayList.get(4800);
            arrayList.get(5000);
            arrayList.get(5200);
            arrayList.get(5400);
            long endTime = System.nanoTime();
            System.out.println("Program runtime by ArrayList: " +(endTime - startTime) + " ns ");

            LinkedList <Integer> linkedList = new LinkedList<>();
            linkedList.addAll(arrayList);
            long start = System.nanoTime();
            linkedList.get(4400);
            linkedList.get(4600);
            linkedList.get(4800);
            linkedList.get(5000);
            linkedList.get(5200);
            linkedList.get(5400);
            long end = System.nanoTime();
            System.out.println("Program runtime by LinkedList: " +(end - start) + " ns ");
            System.out.println();

            for(int j = 1; j < 10; j++)
            {
                if(j == i)
                {
                    System.out.println("Test " + j + ":");
                }
            }
        }
    }
}
