package enums;

public enum ResonatorType {
    SPIDER,
    BISCUIT,
    TRICONE,
    NONE;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
