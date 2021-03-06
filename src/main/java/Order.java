import java.util.ArrayList;
import java.util.List;

/**
 * Order class
 * An order is defined by is id. It contains a list of Product
 * It is displayable via toString() method
 */
public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
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

        //Displaying each product
        for (Product product : products ) {
            sb.append(product.toString());
            sb.append(", ");
        }

        //if it's the last one we remove the comma
        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

}
