import java.util.Scanner;

import static java.lang.Math.sqrt;

public class giai_phuong_trinh_bac_hai {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao gia tri cua a");
        a = sc.nextFloat();
        System.out.printf("nhap vao gia tri cua b");
        b = sc.nextFloat();
        System.out.printf("nhap vao gia tri cua c");
        c = sc.nextFloat();
        if (a==0) {
            if (b == 0) {
                System.out.printf("phuong trinh vo nghiem");
            } else {
                double nghiem = -b / a;
                System.out.printf("nghiem cua phuong trinh la:" +nghiem);
            }

        }else {
            double delta =  (b)*(b)-4*a*c;
            if (delta>0) {
                double nghiem1 = (-b + sqrt(delta))/(2*a);
                double nghiem2 = (-b - sqrt(delta))/(2*a);
                System.out.printf("phuong trinh co 2 nghiem phan biet la:" +nghiem1);
                System.out.printf(":" +nghiem2);
                }
             else {
                System.out.printf("phuong trinh vo nghiem");
            }
        }
    }
}
