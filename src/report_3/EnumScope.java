package report_3;

import java.util.Scanner;

public class EnumScope {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("정수 A:"); int a = value.nextInt(); //정수 a값 받기
        System.out.print("정수 B:"); int b = value.nextInt(); //정수 b값 받기
        if (a>b){ //a가 b보다 크다면
            int t = a;
            a = b;
            b = t;
            //a와 b값 교체하는 구문
        }
        do{ //a가 b보다 크지 않다면 위 if문은 실행하지않고 넘어간다.
            System.out.println(a + " ");
            a = a + 1;
        }while (a <= b); //이 구문이 참일 시에만 다시 do문을 실행한다.
        System.out.println(); //마지막에 한 줄 띄우려고 입력. 없어도 상관없음
    }
}
