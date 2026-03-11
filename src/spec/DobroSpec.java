package spec;

import enums.Brand;
import enums.ResonatorType;
import enums.Wood;

public class DobroSpec extends InstrumentSpec {
    private ResonatorType resonatorType;
    private int numStrings;
    private String drumHeadMaterial;

    public DobroSpec(Brand brand, String modelNumber, Wood topWood, Wood backWood,
                     ResonatorType resonatorType, int numStrings, String drumHeadMaterial) {
        super(brand, modelNumber, topWood, backWood);
        this.resonatorType = resonatorType;
        this.numStrings = numStrings;
        this.drumHeadMaterial = (drumHeadMaterial == null) ? "" : drumHeadMaterial;
    }

    public ResonatorType getResonatorType() {
        return resonatorType;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String getDrumHeadMaterial() {
        return drumHeadMaterial;
    }

    @Override
    public boolean matches(InstrumentSpec other) {
        if (!super.matches(other)) return false;
        if (!(other instanceof DobroSpec)) return false;
        DobroSpec o = (DobroSpec) other;
        if (o.resonatorType != null && !o.resonatorType.equals(this.resonatorType)) return false;
        if (o.numStrings > 0 && o.numStrings != this.numStrings) return false;
        if (o.drumHeadMaterial != null && !o.drumHeadMaterial.isEmpty()
                && !o.drumHeadMaterial.equalsIgnoreCase(this.drumHeadMaterial)) return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()
                + (resonatorType != null ? "\nResonatorType: " + resonatorType : "")
                + "\nStrings: " + numStrings
                + (drumHeadMaterial != null && !drumHeadMaterial.isEmpty()
                        ? "\nDrumHeadMaterial: " + drumHeadMaterial : "");
    }
}
