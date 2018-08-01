import java.util.Scanner;
import java.util.Random;

public class ung_dung_so_xo {
    public static void main(String[] args) {
        Random rd = new Random();
        int number1 = rd.nextInt(10);
        int number2 = rd.nextInt(10);
        int guessDigit1;
        int guessDigitt2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("moi ban nhap so thu nhat");
        guessDigit1 = sc.nextInt();
        System.out.printf("moi ban nhap so thu hai");
        guessDigitt2 = sc.nextInt();
            System.out.printf("ket qua cua giai là: " + number1 +number2);
        if (guessDigit1 > 9 && guessDigitt2 > 9)
            System.out.printf("nhap sai moi ban nhap so co mot chu so nhe");
        else if (guessDigit1 == number1 && guessDigitt2 == number2) {
            System.out.printf("ban trung giai nhat, phan thhuong cua ban la 10000$");
            } else if (guessDigit1 == number2 && guessDigitt2 == number1) {
            System.out.printf("ban trung giai nhi, phan thuong cua ban la 3000$");
            } else if (guessDigit1 == number1 && guessDigitt2 != number2) {
            System.out.printf("ban trung giai ba, phan thuong cua ban la 1000$");
            ; } else if (guessDigit1 != number1 && guessDigitt2 == number2) {
            System.out.printf("ban trung giai ba, phan thuong cua ban la 1000$");
            } else
            System.out.printf("tiec qua ban khong trung roi .hay thu lai nhe !");
    }
}
