package instrument;

import spec.MandolinSpec;

public class Mandolin extends Instrument {
    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String getInstrumentType() {
        return "Mandolin";
    }

    public MandolinSpec getMandolinSpec() {
        return (MandolinSpec) getSpec();
    }

    @Override
    public String toString() {
        MandolinSpec s = getMandolinSpec();
        return "Instrument: Mandolin"
                + "\n" + s.toString()
                + "\nPrice: " + getPrice()
                + "\nSerial#: " + getSerialNumber();
    }
}
