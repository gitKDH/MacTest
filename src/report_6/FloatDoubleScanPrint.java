package report_6;

import java.util.Scanner;

public class FloatDoubleScanPrint {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다.");
        System.out.print("x : ");
        float x = value.nextFloat();
        System.out.print("y : ");
        double y = value.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
