package mapTask02.model;

import java.util.Map;

public class AppBaseModel {
    public String findKey(String key, Map<String, Integer> map){
        boolean hasKey = map.containsKey(key);
        if(hasKey) {
            Integer quantity = map.get(key);
            return "The quantity of " + key + " is " + quantity.toString();
        }
        return "Product not found";
    }
}
