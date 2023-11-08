package part03.Contraction;

/**
 * 048. while과 단축 연산자를 이용하여 각 자릿수의 합 구하기
 */
public class WhileContraction {
    public static int sumEach(int n) {
        int tot = 0;
        while (n != 0) {
            tot += n % 10;   // 3 -> 2 -> 1
            n /= 10;         // 123 -> 12 -> 1 -> 0
        }
        return tot;
    }

    public static void main(String[] args) {
        int number = 1234567;
        int value = sumEach(number);
        System.out.printf("%d에 대한 각 자리의 숫자 합 : %d", number, value);
    }
}
