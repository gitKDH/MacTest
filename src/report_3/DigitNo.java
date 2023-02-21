package report_3;

import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("양의 정수값의 자릿수를 표시합니다.");
        int x;
        do{ // 무조건 한 번 실행
           System.out.print("양의 정숫값 : "); //자릿수를 알아볼 양의 정수를 입력함
           x = value.nextInt(); // 그 값을 x에 저장함
        }while (x <= 0); //

        int digit = 0;
        while (x > 0){ // 입력한 값이 0 보다 크면
            digit++; // 1을 더함
            x /= 10; // 입력한 값에 10을 나눈 몫(정수이기 때문에)을 다시 저장
        }
        System.out.println("입력한 숫자는 " + digit + "자리입니다.");
    }
}
