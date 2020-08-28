package lecture1;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int soHang, soKyTu, soKyTuTrang;
        int soSao = 1;
        System.out.println("Xin moi nhap vao so hang cua tam giac: ");
        soHang = scanner.nextInt();
        System.out.println("Xin moi nhap so ky tu cua tam giac: ");
        soKyTu = scanner.nextInt();
        System.out.println("Tam giac cua ban voi " + soHang + " hang " + " va " + soKyTu + " ky tu la: ");
        for(int i = 1; i <= soHang; i++)
        {
            soKyTuTrang = (soKyTu - soSao)/2;
            for(int j = 1; j <= soKyTuTrang; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= soSao; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= soKyTuTrang; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
            soSao = soSao + 2;
        }
    }
}
