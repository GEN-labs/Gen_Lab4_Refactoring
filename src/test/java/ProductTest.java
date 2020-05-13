import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void printProductTest(){
        Product p = new Product("Shirt", Color.BLUE, Size.M, 2.99, Currency.TWD);
        String pString = "{\"code\": \"Shirt\", \"color\": \"blue\", \"size\": \"M\", \"price\": 2.99, \"currency\": \"TWD\"}";
        assertEquals(pString, p.toString());
    }


}
