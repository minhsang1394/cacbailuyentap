import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        int songuyen;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.printf("moi ban nhap vao so nguyen");
         songuyen = sc.nextInt();
         if (songuyen <2) {
             System.out.printf("khong la so nguyen to");
             }
             else {
                 count = 2;
                 boolean SNT= true;
             while (count <= Math.sqrt(songuyen)) {
                 if (songuyen % count == 0) {
                     SNT = false;
                     break;
                 }
                 count++;
             }
              if (SNT)
                     System.out.printf(songuyen+ "la so nguyen to");
                     else {
                         System.out.printf(songuyen+  "khong la so nguyen to");
                     }



         }
    }
}
