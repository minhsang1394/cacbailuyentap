import java.sql.SQLOutput;
import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap so nam");
        nam = sc.nextInt();
        boolean lanamnhuan= false;
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                if (nam % 400 == 0) {
                    lanamnhuan = true;
                }
            } else {
                lanamnhuan = true;
            }

        }
        if (lanamnhuan) {
            System.out.printf("la nam nhuan", nam);
        }else {
            System.out.printf("khong la nam nhuan", nam);
        }
    }
}
