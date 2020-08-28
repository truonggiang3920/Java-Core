package lecture1;

import java.util.Scanner;

public class Activity7 {
    public static int main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi nhap vao so thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("Xin moi nhap vao so thu hai: ");
        int b = scanner.nextInt();
        int i;
        System.out.println("Cac so chia het cho " + a + " la: ");
        for(i = 0; i <= 100; i++)
        {
            if(i % a == 0)
            {
             return i;
            }
            /*else if(i % b == 0)
            {
                System.out.print(i + ", ");
            }*/
        }
        return a;
    }
}
