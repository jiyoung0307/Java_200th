package part03.EvenOdd;

/**
 * 044. do~while을 이용하여 1이 될 때까지 나누고 곱하기
 */
public class DoWhileEvenOdd {
    public static void showOddnEvenw(int n) {
        int temp = n;
        do {
            if (temp % 2 == 1) {
                temp = temp * 3 + 1;    // 홀수
            } else {
                temp /= 2;  // 짝수
            }
            System.out.println("[" + temp + "]");
        } while (temp != 1);
        System.out.println("\n--------------------");
    }
    public static void main(String[] args) {
        showOddnEvenw(122);
    }
}