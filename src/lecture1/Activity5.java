package lecture1;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args)
    {
        int n, nn, nnn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi nhap vao so can tinh: ");
        n = scanner.nextInt();
        nn = n*11;
        nnn = n*111;
        int sum = n + nn + nnn;
        System.out.println("Tong cua ba so " + n + " , " + nn + " va " + nnn + " la: " +sum );
    }
}
