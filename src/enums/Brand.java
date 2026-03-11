package enums;

public enum Brand {
    FENDER,
    GIBSON,
    MARTIN,
    TAYLOR,
    IBANEZ,
    YAMAHA,
    DEERING,
    RESONATOR_PROS,
    NATIONAL,
    CREMONA,
    EASTMAN,
    COLLINGS,
    BOURGEOIS,
    BLUEGRASS,
    STELLING;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
