package instrument;

import spec.DobroSpec;

public class Dobro extends Instrument {
    public Dobro(String serialNumber, double price, DobroSpec spec) {
        super(serialNumber, price, spec);
    }

    @Override
    public String getInstrumentType() {
        return "Dobro";
    }

    public DobroSpec getDobroSpec() {
        return (DobroSpec) getSpec();
    }

    @Override
    public String toString() {
        DobroSpec s = getDobroSpec();
        return "Instrument: Dobro"
                + "\n" + s.toString()
                + "\nPrice: " + getPrice()
                + "\nSerial#: " + getSerialNumber();
    }
}
