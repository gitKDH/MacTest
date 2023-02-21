package report_review;

import java.util.Scanner;

public class report2_3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :");
        int a = value.nextInt();
        System.out.print("두번째 정수는 :");
        int b = value.nextInt();

        if (a > b){
            int t = a - b;
            if (t >= 11) {
                System.out.println("두 값의 차는 11이상 입니다");
            }
            else {
                System.out.println("두 값의 차는 10 미만입니다");
            }
        }
        else{
            int t = b - a;
            if (t<=11) {
                System.out.println("두 값의 차는 11이상 입니다");
            }
            else {
                System.out.println("두 값의 차는 10 미만입니다");
            }
        }
    }
}