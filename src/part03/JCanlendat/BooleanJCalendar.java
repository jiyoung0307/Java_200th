package part03.JCanlendat;

/**
 * 041. 논리 연산자(&&, ||)로 윤년 판별하기
 */
public class BooleanJCalendar {
    public boolean isLeapYear(int year) {
        boolean isS = false;
        if (((year % 4) == 0) && (year % 100 != 0 ) || (year % 400 == 0)) {
            isS = true;
        }
        return isS;
    }

    public static void main(String[] args) {
        BooleanJCalendar hc = new BooleanJCalendar();
        System.out.println(hc.isLeapYear(2023));
    }

}
