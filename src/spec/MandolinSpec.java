package spec;

import enums.Brand;
import enums.InstrumentType;
import enums.MandolinStyle;
import enums.Wood;

public class MandolinSpec extends InstrumentSpec {
    private InstrumentType type;
    private MandolinStyle style;

    public MandolinSpec(Brand brand, String modelNumber, Wood topWood, Wood backWood,
                        InstrumentType type, MandolinStyle style) {
        super(brand, modelNumber, topWood, backWood);
        this.type = type;
        this.style = style;
    }

    public InstrumentType getType() {
        return type;
    }

    public MandolinStyle getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec other) {
        if (!super.matches(other)) return false;
        if (!(other instanceof MandolinSpec)) return false;
        MandolinSpec o = (MandolinSpec) other;
        if (o.type != null && !o.type.equals(this.type)) return false;
        if (o.style != null && !o.style.equals(this.style)) return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()
                + (type != null ? "\nType: " + type : "")
                + (style != null ? "\nStyle: " + style : "");
    }
}
