package report_9;

import java.util.Scanner;

public class Med3 {
    //a,b,c의 중간값 반환
    static int med(int a, int b, int c){
        if(a>=b)
            if(b>=c)
                return b;
            else if (a <=c)
                return a;
                else
                    return c;
                else if(a>c)
                    return a;
                else if (b > c)
                    return c;
                    else
                        return b;

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a:"); int a = value.nextInt();
        System.out.print("정수 b:"); int b = value.nextInt();
        System.out.print("정수 c:"); int c = value.nextInt();

        System.out.print("중간값은" + med(a,b,c) + "입니다.");
    }
}
