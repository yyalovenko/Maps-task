import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask03 {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = buildMap();
        printMap("Initial contacts:",map);
        map.replace("Tom","tomasdev@glob.net");
        printMap("Updated contacts:",map);
    }
    public static LinkedHashMap<String, String> buildMap() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Tom", "tom@mail.com");
        map.put("Lisa", "lisa@mail.com");
        map.put("Alice", "alisa@mail.com");
        map.put("Denis", "den@mail.com");
        return map;
    }

    public static void printMap(String title, Map<String,String> map) {
        System.out.println(title);
        int count = 0;
        for(Map.Entry<String,String> m: map.entrySet() ) {
            count++;
            System.out.println(count + ") " + m.getKey() + " - " + m.getValue() );
        }
        System.out.println();
    }
}
