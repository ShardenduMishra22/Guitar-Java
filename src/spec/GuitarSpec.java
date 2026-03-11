package spec;

import enums.Brand;
import enums.InstrumentType;
import enums.Wood;

public class GuitarSpec extends InstrumentSpec {
    private InstrumentType type;
    private int numStrings;

    public GuitarSpec(Brand brand, String modelNumber, Wood topWood, Wood backWood,
                      InstrumentType type, int numStrings) {
        super(brand, modelNumber, topWood, backWood);
        this.type = type;
        this.numStrings = numStrings;
    }

    public InstrumentType getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec other) {
        if (!super.matches(other)) return false;
        if (!(other instanceof GuitarSpec)) return false;
        GuitarSpec o = (GuitarSpec) other;
        if (o.type != null && !o.type.equals(this.type)) return false;
        if (o.numStrings > 0 && o.numStrings != this.numStrings) return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()
                + (type != null ? "\nType: " + type : "")
                + "\nStrings: " + numStrings;
    }
}
