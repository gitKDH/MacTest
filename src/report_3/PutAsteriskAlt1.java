package report_3;

import java.util.Scanner;

public class PutAsteriskAlt1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("몇 개를 표시할까요? : ");
        int n = value.nextInt(); //표시할 연산자의 갯수 입력
        if (n > 0){ // 입력한 갯수가 0보다 크면. 작다면 아예 실행 안함.
            int i = 0; // i에 0 대입
            while (i < n){ // 입력한 숫자가 i보다 크면. 이 값이 참일동안 계속 밑에 구문 반복
                if (i % 2 == 0) //i에 2를 나눈 나머지가 0과 같다면 *을 입력
                    System.out.print("*");
                else //그렇지 않다면 + 입력
                    System.out.print("+");
                i++; // 연산이 끝난 후 i에 1 더함.
            }
        }else {
            System.out.println("실행 못함");
        }
    }
}
