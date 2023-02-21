package report_3;

import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int x;
        do{
            System.out.println("세 자리의 정숫값 : ");
            x = value.nextInt();
        }while (x < 100 || x > 999); // x는 3자리 수의 양의 정수여야 do 구문 실행

        System.out.println("입력한 값은 "+ x +"입니다.");
    }
}
