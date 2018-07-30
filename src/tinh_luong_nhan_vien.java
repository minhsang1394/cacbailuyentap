import java.util.Scanner;

public class tinh_luong_nhan_vien {
    public static void main(String[] args) {
        int luong_thang;
        int so_nam_lam_viec;
        int he_so_luong;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so nam lam viec");
         so_nam_lam_viec = sc.nextInt();
        System.out.printf("nhap he so luong");
        he_so_luong = sc.nextInt();
        int salary = he_so_luong * 4000000 + so_nam_lam_viec * 500000 ;
        if (he_so_luong < 5) {
            System.out.printf("luong thang cua ban la:" +salary);
        }else {
            System.out.printf("he so luong khong hop le");
        }
    }
}
