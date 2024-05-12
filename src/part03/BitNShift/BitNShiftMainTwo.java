package part03.BitNShift;

import java.util.Scanner;

/* 문자열 자르기를 이요하여 2진수 문자열로 바꾸기 */
public class BitNShiftMainTwo {
    /* 10진법수를 2진수 스프링으로 변환 */
    public static String shifts(int a) {
        int BITMASK = 1;
        String s = "";

        for (int i = 0; i <= 31; i++) {
            s = (a & BITMASK) + s;
            a >>= 1;  // a /=2;
        }

        return s.substring(s.indexOf('1'));
    }

    public static void main(String[] args) {
//        int intNums1 = 123;
//        int intNums2 = -123;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("intNums1을 입력하세요 : ");
        int intNums1 = sc1.nextInt();
        System.out.printf("%d : %s%n", intNums1, shifts(intNums1));


        Scanner sc2 = new Scanner(System.in);
        System.out.print("intNums2를 입력하세요 : ");
        int intNums2 = sc2.nextInt();
        System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
    }
}
