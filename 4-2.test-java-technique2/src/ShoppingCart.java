import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList {

    private List<Item> list;
    
    public ShoppingCart() {

    }   
    
    public ShoppingCart(String name, int price) {
        list = new ArrayList<>();
    }
    public int getTotalPrice() {
        int totalPrice = 0;
        for (int list.size() : list.size) {
            totalPrice = totalPrice + list.getPrice;
        }
        return totalPrice;
    }

    public int getAveragePrice() {
        return(getTotalPrice() / list.size());
    }
}
