package report_2;

import java.util.Random;

public class FingerFlashing {
    public static void main(String[] args) {
        Random value = new Random();

        System.out.print("컴퓨터가 낸 것 : ");
        int hand = value.nextInt(3); //0~2 사이의 난수

        switch (hand){
            case 0 : System.out.println("가위"); break;
            case 1 : System.out.println("바위"); break;
            case 2 : System.out.println("보");
        }
    }
}

