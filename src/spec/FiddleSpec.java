package spec;

import enums.Brand;
import enums.Wood;

public class FiddleSpec extends InstrumentSpec {
    private int numStrings;
    private boolean isElectric;

    public FiddleSpec(Brand brand, String modelNumber, Wood topWood, Wood backWood,
                      int numStrings, boolean isElectric) {
        super(brand, modelNumber, topWood, backWood);
        this.numStrings = numStrings;
        this.isElectric = isElectric;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public boolean matches(InstrumentSpec other) {
        if (!super.matches(other)) return false;
        if (!(other instanceof FiddleSpec)) return false;
        FiddleSpec o = (FiddleSpec) other;
        if (o.numStrings > 0 && o.numStrings != this.numStrings) return false;
        // isElectric: only filter when the search spec explicitly marks it
        // We use a tri-state via a wrapper — here we compare directly since
        // FiddleSpec carries a boolean; a -1 sentinel in numStrings means "don't care"
        // For isElectric we always compare (both must match).
        if (o.isElectric != this.isElectric) return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nStrings: " + numStrings
                + "\nElectric: " + isElectric;
    }
}
