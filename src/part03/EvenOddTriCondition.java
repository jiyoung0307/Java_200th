package part03;

// 삼항 연상자를 사용해서 짝홀수 판별하기
public class EvenOddTriCondition {
    public static void main(String[] args) {
        int temp = 99;
        temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;
        System.out.printf("계산 후 ==>%d\n", temp);
    }
}
