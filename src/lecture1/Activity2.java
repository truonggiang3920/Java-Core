package lecture1;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        int a, b, tong, hieu, tich, thuong, chiaLayDu;
        Scanner vuLeHoang = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        a = vuLeHoang.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        b = vuLeHoang.nextInt();
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = a / b;
        chiaLayDu = a % b;
        System.out.println("Tong cua " + a + " va " + b + " la: " +tong);
        System.out.println("Hieu cua " + a + " va " + b + " la: " +hieu);
        System.out.println("Tich cua " + a + " va " + b + " la: " +tich);
        System.out.println("Thuong cua " + a + " va " + b + " la: " +thuong);
        System.out.println("Chia lay du cua " + a + " va " + b + " la: " +chiaLayDu);


    }
}
