package report_2;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("몇 월 입니까? : ");
        int month = value.nextInt();

        switch (month){
            case 3 :
            case 4 :
            case 5 : System.out.println("봄"); break;
            case 6 :
            case 7 :
            case 8 : System.out.println("여름"); break;
            case 9 :
            case 10 :
            case 11 : System.out.println("가을"); break;
            case 12 :
            case 1 :
            case 2 : System.out.println("겨울"); break;
            default:System.out.println("그런 월은 없습니다"); break;
        }
    }
}
