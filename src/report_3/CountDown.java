package report_3;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("카운트다운 합니다.");
        int x;
        do{
            System.out.print("양의 정숫값 : ");
            x = value.nextInt();
        }while (x <= 0); //입력한 값 x 가 0보다 작으면 다시 입력.

        while (x >= 1) //입력한 값 x가 1보다 크거나 작으면 밑에 구문 실행
            System.out.println(x--); //x를 보여주고 x에 -1을 연산함
        System.out.println("x의 값이" +x+"이 됐습니다."); //while문을 만족하지 않으면 이 구문 실행.
    }
}
