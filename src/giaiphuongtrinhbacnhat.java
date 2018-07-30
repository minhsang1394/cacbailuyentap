import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so a:");
        a = sc.nextFloat();
        System.out.print("nhap vao so b:");
        b = sc.nextFloat();

        if (a ==0) {
            if (b != 0) {
                System.out.print("phuong trinh vo nghiem ");
            }
            else {
                    System.out.print("phuong trinh vo so nghiem");
                }
            }

         else{
            double x =  -b / a;
            System.out.print("nghiem phuong trinh la : "+x );
                }


    }
}
