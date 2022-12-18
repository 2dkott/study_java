package model;

public enum ActiveType {
    Y("Y"),
    N("N");

    private final String text;

    ActiveType(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

}
