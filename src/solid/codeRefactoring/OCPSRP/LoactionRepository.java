package solid.codeRefactoring.OCPSRP;

import java.util.HashMap;
import java.util.Map;

public class LoactionRepository {
    private static Map<String, LocationInfo> location = new HashMap<>();

    static {
        location.put("서울", new LocationInfo("서울특별시", 60, 127));
        location.put("서울특별시", new LocationInfo("서울특별시", 60, 127));
        location.put("부산", new LocationInfo("부산광역시", 98, 76));
        location.put("부산광역시", new LocationInfo("부산광역시", 98, 76));
        location.put("대구", new LocationInfo("대구광역시", 89, 90));
        location.put("대구광역시", new LocationInfo("대구광역시", 89, 90));
        location.put("인천", new LocationInfo("인천광역시", 55, 124));
        location.put("인천광역시", new LocationInfo("인천광역시", 55, 124));
        location.put("광주", new LocationInfo("광주광역시", 58, 74));
        location.put("광주광역시", new LocationInfo("광주광역시", 58, 74));
        location.put("대전", new LocationInfo("대전광역시", 67, 100));
        location.put("대전광역시", new LocationInfo("대전광역시", 67, 100));
        location.put("울산", new LocationInfo("울산광역시", 102, 84));
        location.put("울산광역시", new LocationInfo("울산광역시", 102, 84));
        location.put("제주", new LocationInfo("제주특별자치도", 52, 38));
        location.put("제주도", new LocationInfo("제주특별자치도", 52, 38));
        location.put("제주특별자치도", new LocationInfo("제주특별자치도", 52, 38));
    }

    public static LocationInfo find(String city) {
        return location.get(city);
    }
}

