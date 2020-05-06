public enum Size {

    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL"),
    SIZE_NOT_APPLICABLE("Size not applicable");

    private String text;

    Size(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
