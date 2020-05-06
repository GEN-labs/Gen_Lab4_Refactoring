

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");
        sb.append(orders.toString());
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