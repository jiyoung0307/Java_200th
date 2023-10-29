package part03;

public class EnumFruitMain {
    public static void main(String[] args) {
        ENUMFRUIT pear = ENUMFRUIT.APPLE;
        ENUMFRUIT pear2 = ENUMFRUIT.MANGO;

        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal());      // 선언될 때 순서 0
        System.out.println(pear2.ordinal());     // 선언될 때 순서 2
        ENUMFRUIT[] fruits = ENUMFRUIT.values();
        System.out.println(fruits[0]);
    }
}
