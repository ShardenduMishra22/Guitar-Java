package instrument;

import spec.BanjoSpec;

public class Banjo extends Instrument {
    public Banjo(String serialNumber, double price, BanjoSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String getInstrumentType() {
        return "Banjo";
    }

    public BanjoSpec getBanjoSpec() {
        return (BanjoSpec) getSpec();
    }

    @Override
    public String toString() {
        BanjoSpec s = getBanjoSpec();
        return "Instrument: Banjo"
                + "\n" + s.toString()
                + "\nPrice: " + getPrice()
                + "\nSerial#: " + getSerialNumber();
    }
}
