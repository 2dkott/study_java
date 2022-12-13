package views;

public enum ActionTypes {
    ADD("+"),
    SUBTRACT("-");

    private final String action;

    ActionTypes(String action) {
        this.action = action;
    }

    public String geAction() {
        return action;
    }
}
