package report_3;

import java.util.Scanner;

public class PutAsteriskAlt2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("몇개를 표시할까요? : ");
        int n = value.nextInt(); //표시할 값 입력
        if (n > 0){ // 입력받은 값이 0 보다 크면 밑에 구문 실행
            int i = 0;
            while(i < n / 2){ // 입력한 값에 2를 나눈 값이 i 보다 클 때 밑에 구문을 실행
                System.out.print("*+");
                i++;
            }
            if (n % 2 == 1) // 위 구문이 false일 떄 이 구문을 실행
                System.out.print("*");
            System.out.println(); // 의미 없
        }else {
            System.out.println("실행 못함 ");
        }
    }
}
