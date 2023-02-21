package report_3;

import java.util.Scanner;

public class PutAsterisk1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요? :");
        int n = value.nextInt(); //표시할 별의 갯수를 입력
        if (n>0){ // 입력한 수가 0보다 크면 안의 구문 실행
            int i = 0; //i에 0을 저장
            while(i < n){ //i가 n보다 작을 경우 아래 구문 실행
                System.out.print("*");
                i++; //연산 후 i에 1을 더한 뒤 다시 돌아감.
            }
            System.out.println(); //의미 없음
        }
    }
}
