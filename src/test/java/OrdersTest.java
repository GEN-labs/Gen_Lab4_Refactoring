import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class OrdersTest {


    Product product = new Product("1312", Color.BLUE, Size.M, 13.12 ,Currency.USD);
    Orders orders = new Orders();
    Order order111 = new Order(111);

    @Test
    public void printProduct(){
        String res = "{\"code\": \"1312\", \"color\": \"blue\", \"size\": \"M\", \"price\": 13.12, \"currency\": \"$\"}";
        assertEquals(res, product.toString());
    }
    @Test
    public void printOrder(){
        String res = "{\"id\": 111, \"products\": [{\"code\": \"1312\", \"color\": \"blue\", \"size\": \"M\", \"price\": 13.12, \"currency\": \"$\"}]}";
        order111.AddProduct(product);
        System.out.println(order111);
        assertEquals(res, order111.toString());
    }
    @Test
    public void printOrders(){
        order111.AddProduct(product);
        String res = "{\"orders\": [{\"id\": 111, \"products\": [{\"code\": \"1312\", \"color\": \"blue\", \"size\": \"M\", \"price\": 13.12, \"currency\": \"$\"}]}]}";
        assertEquals(res, orders.toString());
    }

    @BeforeEach
    public void SetupOneOrder() {
        orders.AddOrder(order111);
    }

    @Test
    public void NoOrder() {
        assertEquals("{\"orders\": []}", new Orders().toString());
    }

    @Test
    public void OneOrder() {
        String order111 = "{\"id\": 111, \"products\": []}";
        assertEquals("{\"orders\": [" + order111 + "]}", orders.toString());
    }

    @Test
    public void TwoOrders() {
        orders.AddOrder(new Order(222));

        String order111Json = JsonOrder111WithProduct("");
        String order222Json = "{\"id\": 222, \"products\": []}";
        assertEquals("{\"orders\": [" + order111Json + ", " + order222Json + "]}", orders.toString());
    }

    @Test
    public void OneOrderWithOneProduct() {
        order111.AddProduct(new Product("Shirt", Color.BLUE, Size.M, 2.99, Currency.TWD));

        String order111Json = JsonOrder111WithProduct("{\"code\": \"Shirt\", \"color\": \"blue\", \"size\": \"M\", \"price\": 2.99, \"currency\": \"TWD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", orders.toString());
    }

    @Test
    public void OneOrderWithOneProductNoSize() {
        order111.AddProduct(new Product("Pot", Color.RED, Size.SIZE_NOT_APPLICABLE, 16.50, Currency.SGD));

        String order111Json = JsonOrder111WithProduct("{\"code\": \"Pot\", \"color\": \"red\", \"price\": 16.5, \"currency\": \"SGD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", orders.toString());
    }

    private String JsonOrder111WithProduct(String productJson) {
        return "{\"id\": 111, \"products\": [" + productJson + "]}";
    }
}
