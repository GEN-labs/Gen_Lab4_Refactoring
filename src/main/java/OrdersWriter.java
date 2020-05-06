

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < orders.getOrdersCount(); i++) {
            Order order = orders.getOrder(i);
            sb.append("{");
            sb.append("\"id\": ");
            sb.append(order.getOrderId());
            sb.append(", ");
            sb.append("\"products\": [");
            for (int j = 0; j < order.getProductsCount(); j++) {
                Product product = order.getProduct(j);
                sb.append(product.toString());
                sb.append(", ");
            }
            if (order.getProductsCount() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }

            sb.append("]");
            sb.append("}, ");
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

    private String getSizeFor(Product product) {
        return product.getSize().getText();
    }

    private String getColorFor(Product product) {
        return product.getColor().getText();
    }

    public static void main(String[] args) {

        Product p1 = new Product("code1", Color.RED, Size.M, 12.23, Currency.CHF);
        Product p2 = new Product("code1", Color.RED, Size.M, 12.23, Currency.CHF);
        Order order = new Order(1);
        order.AddProduct(p1);
        order.AddProduct(p2);

        Orders orders = new Orders();
        orders.AddOrder(order);
        OrdersWriter ow = new OrdersWriter(orders);

        System.out.println(ow.getContents());
    }
}