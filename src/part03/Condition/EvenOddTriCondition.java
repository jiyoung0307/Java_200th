package part03.Condition;

/**
 * 035. 삼항연산자를 이용하여 짝,홀수 판별하기
 */
public class EvenOddTriCondition {
    public static void main(String[] args) {
        int temp = 99;
        temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;
        System.out.printf("계산 후 ==>%d\n", temp);
    }
}
