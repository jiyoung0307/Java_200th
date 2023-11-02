package CollectionFramework.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

// Set 컬렉션은 저장 순서가 유지되지 않는다.
// 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다.
// 인덱스로 관리하지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없다.
public class HashSetExample {
    public static void main(String[] args) {
//        HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

//        객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");        // 중복 객체이므로 저장하지 않음
        set.add("Spring");

//        저장된 객체 수 출력
        int size = set.size();
        System.out.printf("총 객체 수 : " + size);
    }
}
