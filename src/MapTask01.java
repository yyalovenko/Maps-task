import java.util.HashMap;
import java.util.Map;

public class MapTask01 {

    public static void main(String[] args) {
        Map<String,String> map1 = buildMap();
        MapTask01.printMap("Initial data: ",map1);
        map1.put("plum", "15 kg");
        MapTask01.printMap("Updated data: ",map1);
    }

public static Map<String,String> buildMap() {
    Map<String,String> data = new HashMap<>();
    data.put("orange","12 kg");
    data.put("banana","25 kg");
    data.put("lemon","8 kg");
    data.put("pineapple","13 kg");
    data.put("grape","9 kg");
    return data;
}


public static void printMap(String title, Map<String,String> map) {
    System.out.println(title);
    int count = 0;
    for(Map.Entry<String,String> m: map.entrySet() ) {
        count++;
        System.out.println(count + ") " + m.getKey() + ", " + m.getValue() );
    }
    System.out.println();
}

}
