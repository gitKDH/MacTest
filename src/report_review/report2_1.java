package report_review;

import java.util.Scanner;

public class report2_1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 값 입력 : "); float a = value.nextFloat();
        System.out.print("두번째 값 입력 : "); float b = value.nextFloat();

        if(a>b)
            System.out.println("큰 값은 "+ a+"입니다");
        else
            System.out.println("큰 값은 "+ b +"입니다");
    }
}
