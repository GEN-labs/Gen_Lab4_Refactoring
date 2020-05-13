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

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }

    public String toString(){

        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (Order order : orders) {
            sb.append(order.toString());
            sb.append(", ");
        }
        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.append("]}").toString();
    }
}
