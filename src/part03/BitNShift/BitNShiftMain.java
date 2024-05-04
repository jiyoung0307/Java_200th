package part03.BitNShift;

import java.util.Scanner;

/* >>shift ? 삼항연산자 */
public class BitNShiftMain {
    /* 10진수를 정수를 2진수 문자열(스트링)으로 변환 */
    public static String shifts(int a) {
        String s = "";
        for (int i = 0; i < 31; i++) {
            int aa = a % 2;
            s = (aa >= 0) ? aa+s : (-aa)+s;
            a>>=1;  // a/=2;
        }
        return s;
    }

    public static void main(String[] args) {
//        int intNums1 = 123;
//        int intNums2 = -123;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("intNums1를 입력하세요 : ");
        int intNums1 = sc1.nextInt();
        System.out.printf("%d : %s%n", intNums1,shifts(intNums1));

        Scanner sc2 = new Scanner(System.in);
        System.out.print("intNums2를 입력하세요 : ");
        int intNums2 = sc2.nextInt();
        System.out.printf("%d : %s%n", intNums2,shifts(intNums2));
    }
}
