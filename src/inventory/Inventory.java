package inventory;

import instrument.Instrument;
import spec.InstrumentSpec;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory() {
        instruments = new ArrayList<>();
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public List<Instrument> getAllInstruments() {
        return new ArrayList<>(instruments);
    }

    /**
     * Searches the inventory using partial specification matching.
     * The searchSpec acts as a filter — only non-null / non-zero fields
     * in searchSpec are used as criteria.
     */
    public List<Instrument> search(InstrumentSpec searchSpec) {
        List<Instrument> matches = new ArrayList<>();
        for (Instrument instrument : instruments) {
            if (instrument.getSpec().matches(searchSpec)) {
                matches.add(instrument);
            }
        }
        return matches;
    }
}
