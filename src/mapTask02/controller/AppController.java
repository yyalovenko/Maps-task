package mapTask02.controller;

import mapTask02.model.AppBaseModel;
import mapTask02.view.AppView;

import java.util.HashMap;
import java.util.Map;

public class AppController {

public void runController() {
    Map<String, Integer> mockMap = AppController.getData();
    final AppView view = new AppView();
    String productName = view.getData();
    AppBaseModel model = new AppBaseModel();
    String searchResult = model.findKey(productName,mockMap);
    view.printResult(searchResult);
}

    public static Map<String,Integer> getData(){
        Map<String,Integer> mockMap = new HashMap<>();
        mockMap.put("Coffee",15);
        mockMap.put("Sugar",10);
        mockMap.put("Tea",33);
        mockMap.put("Milk",15);
        mockMap.put("Cola",2);
        mockMap.put("Chocolate",27);
        mockMap.put("Pepsi",15);
        return mockMap;
    }
}
