package part03.GeoPoint;

import part03.GeoPoint.ObjectGeoPoint;

/**
 * 033. 객체를 이용하여 위도, 경도 표현하기
 */
public class ObjectGeoPointMain {
    public static void main(String[] args) {
//        실수 변수
        double latitude1 = 37.52127220511242;
        double longitude1 = 127.0074462890625;   // 서울
        double latitude2 = 35.137879119634185;
        double longitude2 = 129.04541015625;     // 부산

//        위도, 경도 객체
        ObjectGeoPoint geo1 = new ObjectGeoPoint();
        geo1.latitude = latitude1;
        geo1.longitude = longitude1;
        System.out.println(geo1.latitude + "\t" + geo1.longitude);

        ObjectGeoPoint geo2 = new ObjectGeoPoint();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;

//        객체 전달
        ObjectGeoPoint geo  = geo1;
        System.out.println(geo.latitude + "\t" + geo.longitude);
    }
}
