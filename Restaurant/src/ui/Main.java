package ui;


import model.TakeoutOrder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TakeoutOrder> allOrders = new ArrayList<>();
        TakeoutOrder o1 = new TakeoutOrder(1, "Jon Doe");
        o1.setOrderParams("complete", 'A', "Much sauce");
        allOrders.add(o1);
        TakeoutOrder o2 = new TakeoutOrder(2, "Peter Henly");
        o2.setOrderParams("in progress", 'B', "None");
        allOrders.add(o2);
        TakeoutOrder o3 = new TakeoutOrder(3, "Jane Bean");
        o1.setOrderParams("complete", 'A', "No sauce");
        allOrders.add(o3);
        for (TakeoutOrder o : allOrders) {
            o.printStatus();
        }
    }
}
