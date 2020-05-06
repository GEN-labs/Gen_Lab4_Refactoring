

import java.util.ArrayList;
import java.util.List;

//test

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(id);
        sb.append(", ");
        sb.append("\"products\": [");
        for (Product product : products ) {
            sb.append(product.toString());
            sb.append(", ");
        }
        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        sb.append("}");
        return sb.toString();
    }

}
