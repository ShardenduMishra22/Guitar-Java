package enums;

public enum InstrumentType {
    ELECTRIC,
    ACOUSTIC,
    HYBRID,
    BASS;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
