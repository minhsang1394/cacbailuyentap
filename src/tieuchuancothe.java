import java.util.Scanner;

public class tieuchuancothe {
    public static void main(String[] args) {
        double weight,height ;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao can nang cua ban (kilogam)");
        weight = sc.nextDouble();
        System.out.print("nhap vao chieu cao cua ban(meter)");
        height = sc.nextDouble();
        double bmi = weight/ Math.pow(height,2);
        System.out.printf("chi so bmi cua ban :  " +bmi );
        if (bmi < 18)
            System.out.printf("underweight ");
        else if (bmi < 25)
            System.out.printf("normal ");
        else if (bmi < 30)
            System.out.printf("overweight ");
        else
            System.out.printf("obses");
    }
}
