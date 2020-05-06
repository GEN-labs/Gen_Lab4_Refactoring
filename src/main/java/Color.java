public enum Color{
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    NOCOLOR("no color");

    private String text;

    Color(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}