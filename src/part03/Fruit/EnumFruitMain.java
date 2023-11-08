package part03.Fruit;

/**
 * 031. 상수의 묶음 클래스 enum 사용하기
 */
public class EnumFruitMain {
    public static void main(String[] args) {
        EnumFruit pear = EnumFruit.APPLE;
        EnumFruit pear2 = EnumFruit.MANGO;

        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal());      // 선언될 때 순서 0
        System.out.println(pear2.ordinal());     // 선언될 때 순서 2
        EnumFruit[] fruits = EnumFruit.values();
        System.out.println(fruits[0]);
    }
}
