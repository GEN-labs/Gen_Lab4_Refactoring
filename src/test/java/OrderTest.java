import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void getProductsCountTestAndAddProduct(){
        Order o = new Order(111);
        Product p = new Product("Code", Color.BLUE, Size.XXL, 10.0, Currency.CHF);
        o.AddProduct(p);
        assertEquals(o.getProduct(0), p);
        assertEquals(1, o.getProductsCount());
    }

    @Test
    public void printOrderTest(){
        Order o = new Order(111);
        String order111 = "{\"id\": 111, \"products\": []}";
        assertEquals(order111, o.toString());
    }

}
