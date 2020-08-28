package lecture4_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB managerOfficer = new QLCB();
        List <CanBo> canBoList = new ArrayList<>();
         while (true){
             System.out.println("Nhập phím 1 để thêm mới cán bộ");
             System.out.println("Nhập phím 2 để tìm kiếm cán bộ theo tên");
             System.out.println("Nhập phím 3 để hiển thị danh sách cán bộ");
             System.out.println("Nhập phím 4 để thoát");
             System.out.print("Mời nhập vào: ");
             int check = scanner.nextInt();
             while (check <= 0 || check > 4){
                 System.out.println("Xin mời nhập lại!");
                 check = scanner.nextInt();
             }
             if(check == 4){
                 System.out.println("Kết thúc!");
                 break;
             }

             switch (check) {
                 case 1: {
                     System.out.println("Nhập 5 để điền thêm thông tin công nhân");
                     System.out.println("Nhập 6 để điền thêm thông tin kỹ sư");
                     System.out.println("Nhập 7 để điền thêm thông tin nhân viên");
                     System.out.print("Mời nhập vào: ");
                     int check2 = scanner.nextInt();
                     scanner.nextLine();
                     switch (check2) {
                         case 5: {
                             System.out.print("Nhập vào họ và tên: ");
                             String name = scanner.nextLine();
                             System.out.print("Nhập vào tuổi: ");
                             int age = scanner.nextInt();;
                             scanner.nextLine();
                             System.out.print("Nhập vào giới tính: ");
                             String gender = scanner.nextLine();
                             System.out.print("Nhập vào địa chỉ: ");
                             String address = scanner.nextLine();
                             System.out.print("Nhập vào bậc của công nhân: ");
                             int rank = scanner.nextInt();
                             Worker wk = managerOfficer.themCanBo(name, age, gender, address, rank);
                             canBoList.add(wk);
                             System.out.println("Đã thêm mới cán bộ!");
                             break;
                         }

                         case 6: {
                             System.out.print("Nhập vào họ và tên: ");
                             String name = scanner.nextLine();
                             System.out.print("Nhập vào tuổi: ");
                             int age = scanner.nextInt();
                             scanner.nextLine();
                             System.out.print("Nhập vào giới tính: ");
                             String gender = scanner.nextLine();
                             System.out.print("Nhập vào địa chỉ: ");
                             String address = scanner.nextLine();
                             System.out.print("Nhập vào nghành đào tạo của kỹ sư: ");
                             String trainingSector = scanner.nextLine();
                             Engineer en = managerOfficer.themCanBo1(name, age, gender, address, trainingSector);
                             canBoList.add(en);
                             System.out.println("Đã thêm mới cán bộ!");
                             break;
                         }
                         case 7: {
                             System.out.print("Nhập vào họ và tên: ");
                             String name = scanner.nextLine();
                             System.out.print("Nhập vào tuổi: ");
                             int age = scanner.nextInt();
                             scanner.nextLine();
                             System.out.print("Nhập vào giới tính: ");
                             String gender = scanner.nextLine();
                             System.out.print("Nhập vào địa chỉ: ");
                             String address = scanner.nextLine();
                             System.out.print("Nhập vào công việc của nhân viên: ");
                             String work = scanner.nextLine();
                             Staff st = managerOfficer.themCanBo2(name, age, gender, address, work);
                             canBoList.add(st);
                             System.out.println("Đã thêm mới cán bộ!");
                             break;
                         }
                         default:
                             System.out.println("Không hợp lệ!");
                             break;
                     }
                     break;
                 }

                 case 2: {
                     System.out.print("Nhập vào tên cán bộ: ");
                     scanner.nextLine();
                     String name = scanner.nextLine();
                     CanBo cb = managerOfficer.timCanBo(name, canBoList);
                     if(cb == null){
                         System.out.println("Không hợp lệ!");
                     }
                     else {
                         System.out.println(cb.toString());
                     }
                 }

                 case 3: {
                     managerOfficer.thongTinCanBo(canBoList);
                 }
             }
        }
    }
}