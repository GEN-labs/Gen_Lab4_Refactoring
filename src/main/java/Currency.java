public enum Currency {

    USD("$"),
    SGD("SGD"),
    TWD("TWD"),
    CHF("CHF"),
    EUR("€"),
    YEN("¥"),
    NOCURRENCY("no currency");

    private String text;

    Currency(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
