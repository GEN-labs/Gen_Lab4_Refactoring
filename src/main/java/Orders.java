import java.util.ArrayList;
import java.util.List;

/**
 * Orders class
 * An Orders object contains a list of Order objects
 * It is displayable via toString() method
 */
public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public String toString(){

        StringBuilder sb = new StringBuilder("{\"orders\": [");

        //Displaying each order
        for (Order order : orders) {
            sb.append(order.toString());
            sb.append(", ");
        }

        //if it's the last one we remove the comma
        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.append("]}").toString();
    }
}
