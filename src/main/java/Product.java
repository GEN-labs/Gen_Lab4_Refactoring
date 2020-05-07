public class Product {

    private String code;
    private Color color;
    private Size size;
    private double price;
    private Currency currency;

    public Product(String code, Color color, Size size, double price, Currency currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(code);
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color.getText());
        sb.append("\", ");

        if (size != Size.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(size.getText());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(price);
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(currency.getText());
        sb.append("\"}");

        return sb.toString();

    }

}