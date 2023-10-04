package Hotell;

public enum LiquidType {
    MINERALVATTEN,
    PROTEINDRYCK,
    KRANVATTEN;

    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
