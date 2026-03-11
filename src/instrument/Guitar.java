package instrument;

import spec.GuitarSpec;

public class Guitar extends Instrument {
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String getInstrumentType() {
        return "Guitar";
    }

    public GuitarSpec getGuitarSpec() {
        return (GuitarSpec) getSpec();
    }

    @Override
    public String toString() {
        GuitarSpec s = getGuitarSpec();
        return "Instrument: Guitar"
                + "\n" + s.toString()
                + "\nPrice: " + getPrice()
                + "\nSerial#: " + getSerialNumber();
    }
}
