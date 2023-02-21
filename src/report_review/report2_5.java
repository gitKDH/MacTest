package report_review;

import java.util.Scanner;

public class report2_5 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :"); int a = value.nextInt();
        System.out.print("두번째 정수는 :"); int b = value.nextInt();
        System.out.print("세번째 정수는 :"); int c = value.nextInt();

        int middle;
        if(a>=b){
            if(b>=c){
                middle = b;
            } else if (a<=c) {
                middle = a;
            }else {
                middle = c;
            }
        } else if (a>c) {
            middle = a;
        } else if (b>c) {
            middle = c;
        }else{
            middle = b;
        }
        System.out.println("중간값은" + middle);
    }
}
