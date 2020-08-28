package lecture1;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin mời nhập vào số cần tính bảng cửu chương: ");
        int number = scanner.nextInt();
        while (number <= 0 || number > 10)
        {
            System.out.println("Số bạn nhập không hợp lệ!");
            System.out.println("Xin mời bạn nhập lại: ");
            number = scanner.nextInt();
        }
        System.out.println("Bảng cửu chương của " + number + " là: ");
        for(int j = 1; j <= 10; j++)
        {
            System.out.println(number + " x " + j + " = " +(number*j));
        }
    }
}
