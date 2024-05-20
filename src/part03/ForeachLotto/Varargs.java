package part03.ForeachLotto;

/* 055. varargs를 이용하여 배열 출력하기 */
public class Varargs {
    public static void print(int ... mm) {
        for (int m : mm) {
            System.out.printf(m + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]mm = {1,6,16,22,23,33};
        print(mm);  // 배열
        int a = 1, b = 6, c = 16;
        print(a);       // int 타입 아규먼트(인자)를 1개 받음
        print(a,b);     // int 타입 아규먼트(인자)를 2개 받음
        print(a,b,c);   // int 타입 아규먼트(인자)를 3개 받음
    }
}
