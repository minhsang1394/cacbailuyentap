import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mơi ban nhap thang can tinh");
        thang = sc.nextInt();
        if (thang<=12 && thang>0)
            switch (thang) {
                case 1:
                    ;
                case 3:
                    ;
                case 5:
                    ;
                case 7:
                    ;
                case 8:
                    ;
                case 10:
                    ;
                case 12:
                    ;
                    System.out.printf("thang " + thang + "co 31 ngay");
                    break;
                case 2:
                    ;
                    System.out.printf("thang" + thang + "co 28 hoac 29 ngay");
                    break;
                default:
                    System.out.print("thang" + thang + "co 30 ngay");
                    break;
            }
        else
            System.out.printf("thang ban nhap khong dung");
    }
}
