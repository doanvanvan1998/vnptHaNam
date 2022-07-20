import java.util.Scanner;

public class tinhThamSo {
    public static int tinhChuViHinhChuNhat(int chieuDai,int chieuRong){
        int chuVi = (chieuDai+chieuRong)*2;
        return chuVi;
    }
    public static int tinDienTichHinhChuNhat(int chieuDai,int chieuRong){
        int dientich = chieuDai*chieuRong;
        return dientich;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin hình chữ nhật");
        System.out.println("nhập chiều dai");
        int chieuDai = sc.nextInt();
        System.out.println("nhập chiều rộng");
        int chieuRong = sc.nextInt();
        System.out.println("bạn chon tính diện tích(điền 1) or chu vi (điền 2)");
        int choice = sc.nextInt();
        if (choice == 1){
            int tong= tinDienTichHinhChuNhat(chieuDai,chieuRong);
            System.out.println("diện tích là "+tong);
        }else if(choice == 2 ) {
           int tong = tinhChuViHinhChuNhat(chieuDai,chieuRong);
            System.out.println("chu vi là "+tong);
        }
    }
}
