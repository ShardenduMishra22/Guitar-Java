package instrument;

import spec.FiddleSpec;

public class Fiddle extends Instrument {
    public Fiddle(String serialNumber, double price, FiddleSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String getInstrumentType() {
        return "Fiddle";
    }

    public FiddleSpec getFiddleSpec() {
        return (FiddleSpec) getSpec();
    }

    @Override
    public String toString() {
        FiddleSpec s = getFiddleSpec();
        return "Instrument: Fiddle"
                + "\n" + s.toString()
                + "\nPrice: " + getPrice()
                + "\nSerial#: " + getSerialNumber();
    }
}
