import java.util.Scanner;

public class Student {
    // hàm trong java
    public static int tinhTong(int a, int b){
        int tong = a+b;
      return tong;
    }
    public int nhanHaiSo(int a, int b){
        int result = a*b;
        return result;
    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số thứ 1");
//        int a = scanner.nextInt();
//        System.out.println("nhập số thứ 2");
//        int b = scanner.nextInt();
//
//       int tong = tinhTong(a,b);
//        System.out.println("kết quả là "+tong);
//        Student st = new Student();
//       int result = st.nhanHaiSo(7,8);
//        System.out.println(tong);
//        System.out.println(result);

        int tongchan = 0;
        int tongle =0;
        for (int i = 0; i <40; i++) {
            if (i !=0 && i !=1 && i % 2 == 0){
                //no là so chan
                tongchan += i;
            }else {
                tongle += i;
            }

        }

        System.out.println(tongchan);
        System.out.println(tongle);

    }
}
