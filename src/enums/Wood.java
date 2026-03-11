package enums;

public enum Wood {
    ALDER,
    MAHOGANY,
    MAPLE,
    ROSEWOOD,
    SPRUCE,
    CEDAR,
    EBONY,
    WALNUT,
    ASH,
    BASSWOOD,
    KOA,
    SITKA,
    OTHER;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
