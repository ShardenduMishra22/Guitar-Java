package spec;

import enums.Brand;
import enums.Wood;

public class InstrumentSpec {
    private Brand brand;
    private String modelNumber;
    private Wood topWood;
    private Wood backWood;

    public InstrumentSpec(Brand brand, String modelNumber, Wood topWood, Wood backWood) {
        this.brand = brand;
        this.modelNumber = (modelNumber == null) ? "" : modelNumber;
        this.topWood = topWood;
        this.backWood = backWood;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    /**
     * Partial matching: if the search spec has a non-null field,
     * this spec must match it. Null fields in the search spec are wildcards.
     */
    public boolean matches(InstrumentSpec other) {
        if (other.brand != null && !other.brand.equals(this.brand)) return false;
        if (other.modelNumber != null && !other.modelNumber.isEmpty()
                && !other.modelNumber.equalsIgnoreCase(this.modelNumber)) return false;
        if (other.topWood != null && !other.topWood.equals(this.topWood)) return false;
        if (other.backWood != null && !other.backWood.equals(this.backWood)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Brand: " + brand
                + (modelNumber != null && !modelNumber.isEmpty() ? "\nModel: " + modelNumber : "")
                + (topWood != null ? "\nTopWood: " + topWood : "")
                + (backWood != null ? "\nBackWood: " + backWood : "");
    }
}
