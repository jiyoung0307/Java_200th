package part03;

/* 입력받은 수가 소수인지 판별 */
public class PrimMath {
    public static boolean isPrime(int n) {
        boolean isS = true;
        for (int i = 2; i < (int)Math.sqrt(n); i++) {
            if (n%i == 0) {
                isS = false;
                break;
            }
        }
        return isS;
    }

    /*
    소수란 1과 자신으로만 떨어지는 수임.
    즉, 1과 자신을 제외한 다른 수로는 나누어 떨어지지 않음
    이 때 반복 횟수를 최소화하기 위해 제곱근(에라토스테네스)를 이용
     */
    public static void main(String[] args) {
        int num = 123456789;
        boolean ifPrime = isPrime(num);     // 소수인가 판별
        if(ifPrime) {
            System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다.", num);
        } else {
            System.out.printf("%d는 소수가 아니다.", num);
        }
    }
}
