package part03;

public class MemberBioCalendar {
    public static final int PHYSICAL = 23;      // static 변수 생성 없이 사용

    public double getBioRhythm(long days, int index, int max) {
        return max * Math.sin((days % index) * 2 * Math.PI / index);
    }

    public static void main(String[] args) {
        int days = 1200;
        MemberBioCalendar memberBioCalendar = new MemberBioCalendar();

        double phyval = memberBioCalendar.getBioRhythm(days, PHYSICAL, 100);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
    }
}
