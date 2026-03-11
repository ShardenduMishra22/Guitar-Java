import enums.Brand;
import enums.InstrumentType;
import enums.MandolinStyle;
import enums.ResonatorType;
import enums.Wood;
import instrument.Banjo;
import instrument.Dobro;
import instrument.Fiddle;
import instrument.Guitar;
import instrument.Instrument;
import instrument.Mandolin;
import inventory.Inventory;
import spec.BanjoSpec;
import spec.DobroSpec;
import spec.FiddleSpec;
import spec.GuitarSpec;
import spec.InstrumentSpec;
import spec.MandolinSpec;

import java.util.List;

public class Main {

    // -----------------------------------------------------------------------
    // Helpers to populate inventory
    // -----------------------------------------------------------------------

    private static void addMandolins(Inventory inv) {
        // 15 mandolins
        inv.addInstrument(new Mandolin("M001", 1200, new MandolinSpec(Brand.GIBSON,    "F5",        Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M002",  950, new MandolinSpec(Brand.GIBSON,    "A5",        Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M003", 1400, new MandolinSpec(Brand.EASTMAN,   "MD814",     Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M004",  800, new MandolinSpec(Brand.EASTMAN,   "MD304",     Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M005",  650, new MandolinSpec(Brand.IBANEZ,    "M522S",     Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M006",  700, new MandolinSpec(Brand.IBANEZ,    "M510",      Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M007", 1800, new MandolinSpec(Brand.COLLINGS,  "MF",        Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M008", 1600, new MandolinSpec(Brand.COLLINGS,  "MT",        Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M009",  500, new MandolinSpec(Brand.YAMAHA,    "F335",      Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M010",  400, new MandolinSpec(Brand.YAMAHA,    "F310",      Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M011", 2200, new MandolinSpec(Brand.GIBSON,    "Custom F5", Wood.SPRUCE,    Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M012", 1100, new MandolinSpec(Brand.EASTMAN,   "MD615",     Wood.CEDAR,     Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.F)));
        inv.addInstrument(new Mandolin("M013",  750, new MandolinSpec(Brand.IBANEZ,    "M522",      Wood.SPRUCE,    Wood.KOA,       InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M014",  900, new MandolinSpec(Brand.BOURGEOIS, "A-Style",   Wood.SITKA,     Wood.MAHOGANY,  InstrumentType.ACOUSTIC, MandolinStyle.A)));
        inv.addInstrument(new Mandolin("M015", 1350, new MandolinSpec(Brand.BOURGEOIS, "F-Style",   Wood.SITKA,     Wood.MAPLE,     InstrumentType.ACOUSTIC, MandolinStyle.F)));
    }

    private static void addGuitars(Inventory inv) {
        // 30 guitars
        inv.addInstrument(new Guitar("G001", 1500, new GuitarSpec(Brand.FENDER,   "Stratocaster",      Wood.ALDER,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G002", 1700, new GuitarSpec(Brand.FENDER,   "Telecaster",        Wood.ASH,       Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G003", 2000, new GuitarSpec(Brand.GIBSON,   "Les Paul",          Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G004", 1800, new GuitarSpec(Brand.GIBSON,   "SG Standard",       Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G005", 2500, new GuitarSpec(Brand.MARTIN,   "D-28",              Wood.SPRUCE,    Wood.ROSEWOOD,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G006", 2200, new GuitarSpec(Brand.MARTIN,   "000-28",            Wood.SPRUCE,    Wood.ROSEWOOD,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G007", 3000, new GuitarSpec(Brand.TAYLOR,   "814ce",             Wood.SPRUCE,    Wood.ROSEWOOD,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G008", 2800, new GuitarSpec(Brand.TAYLOR,   "714ce",             Wood.CEDAR,     Wood.ROSEWOOD,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G009",  900, new GuitarSpec(Brand.IBANEZ,   "RG421",             Wood.MAPLE,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G010",  750, new GuitarSpec(Brand.IBANEZ,   "GRX70QA",           Wood.BASSWOOD,  Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G011", 1200, new GuitarSpec(Brand.FENDER,   "Jaguar",            Wood.ALDER,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G012", 1300, new GuitarSpec(Brand.FENDER,   "Jazzmaster",        Wood.ALDER,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G013", 1900, new GuitarSpec(Brand.GIBSON,   "ES-335",            Wood.MAPLE,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G014", 1600, new GuitarSpec(Brand.GIBSON,   "Flying V",          Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G015", 3500, new GuitarSpec(Brand.MARTIN,   "OM-42",             Wood.SPRUCE,    Wood.ROSEWOOD,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G016", 2600, new GuitarSpec(Brand.TAYLOR,   "Grand Auditorium",  Wood.MAPLE,     Wood.MAPLE,     InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G017", 1100, new GuitarSpec(Brand.IBANEZ,   "AEG50",             Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G018",  600, new GuitarSpec(Brand.YAMAHA,   "FG800",             Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G019",  500, new GuitarSpec(Brand.YAMAHA,   "Pacifica112V",      Wood.ALDER,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G020", 1400, new GuitarSpec(Brand.FENDER,   "Mustang Bass",      Wood.ALDER,     Wood.MAPLE,     InstrumentType.BASS,      4)));
        inv.addInstrument(new Guitar("G021", 1600, new GuitarSpec(Brand.GIBSON,   "Thunderbird Bass",  Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.BASS,      4)));
        inv.addInstrument(new Guitar("G022", 1000, new GuitarSpec(Brand.IBANEZ,   "GSR200",            Wood.BASSWOOD,  Wood.MAPLE,     InstrumentType.BASS,      4)));
        inv.addInstrument(new Guitar("G023", 2200, new GuitarSpec(Brand.MARTIN,   "GPC-13E",           Wood.SPRUCE,    Wood.MAHOGANY,  InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G024", 2900, new GuitarSpec(Brand.TAYLOR,   "K24ce",             Wood.KOA,       Wood.KOA,       InstrumentType.ACOUSTIC,  6)));
        inv.addInstrument(new Guitar("G025", 1350, new GuitarSpec(Brand.FENDER,   "Strat Plus",        Wood.ALDER,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G026", 2100, new GuitarSpec(Brand.GIBSON,   "Les Paul Classic",  Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G027",  850, new GuitarSpec(Brand.IBANEZ,   "S520",              Wood.MAPLE,     Wood.MAPLE,     InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G028",  700, new GuitarSpec(Brand.YAMAHA,   "Revstar RSP20CR",   Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.ELECTRIC,  6)));
        inv.addInstrument(new Guitar("G029", 1750, new GuitarSpec(Brand.FENDER,   "Precision Bass",    Wood.ALDER,     Wood.MAPLE,     InstrumentType.BASS,      4)));
        inv.addInstrument(new Guitar("G030", 1950, new GuitarSpec(Brand.GIBSON,   "Explorer",          Wood.MAHOGANY,  Wood.MAHOGANY,  InstrumentType.ELECTRIC,  6)));
    }

    private static void addBanjos(Inventory inv) {
        // 20 banjos
        inv.addInstrument(new Banjo("B001",  900, new BanjoSpec(Brand.DEERING,    "Goodtime",       Wood.MAPLE,    ResonatorType.SPIDER,   5, "Mylar")));
        inv.addInstrument(new Banjo("B002", 1400, new BanjoSpec(Brand.DEERING,    "Classic Goodtime",Wood.MAPLE,   ResonatorType.BISCUIT,  5, "Mylar")));
        inv.addInstrument(new Banjo("B003", 2200, new BanjoSpec(Brand.GIBSON,     "RB-250",          Wood.MAPLE,   ResonatorType.SPIDER,   5, "Mylar")));
        inv.addInstrument(new Banjo("B004", 3000, new BanjoSpec(Brand.GIBSON,     "Mastertone",      Wood.MAPLE,   ResonatorType.SPIDER,   5, "Fiberskyn")));
        inv.addInstrument(new Banjo("B005",  700, new BanjoSpec(Brand.IBANEZ,     "B50",             Wood.MAPLE,   ResonatorType.BISCUIT,  5, "Mylar")));
        inv.addInstrument(new Banjo("B006",  600, new BanjoSpec(Brand.IBANEZ,     "B200",            Wood.WALNUT,  ResonatorType.NONE,     4, "Mylar")));
        inv.addInstrument(new Banjo("B007", 1200, new BanjoSpec(Brand.STELLING,   "Sunflower",       Wood.MAPLE,   ResonatorType.SPIDER,   5, "Fiberskyn")));
        inv.addInstrument(new Banjo("B008", 1800, new BanjoSpec(Brand.STELLING,   "Bellflower",      Wood.MAPLE,   ResonatorType.SPIDER,   5, "Mylar")));
        inv.addInstrument(new Banjo("B009",  850, new BanjoSpec(Brand.DEERING,    "Vega Senator",    Wood.MAPLE,   ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Banjo("B010", 1100, new BanjoSpec(Brand.DEERING,    "Sierra",          Wood.MAPLE,   ResonatorType.BISCUIT,  5, "Fiberskyn")));
        inv.addInstrument(new Banjo("B011", 2500, new BanjoSpec(Brand.GIBSON,     "RB-3",            Wood.MAPLE,   ResonatorType.SPIDER,   5, "Mylar")));
        inv.addInstrument(new Banjo("B012",  950, new BanjoSpec(Brand.BLUEGRASS,  "BG-250F",         Wood.MAPLE,   ResonatorType.SPIDER,   5, "Mylar")));
        inv.addInstrument(new Banjo("B013",  650, new BanjoSpec(Brand.BLUEGRASS,  "BG-150",          Wood.MAHOGANY,ResonatorType.NONE,     4, "Mylar")));
        inv.addInstrument(new Banjo("B014", 1700, new BanjoSpec(Brand.STELLING,   "Golden Cross",    Wood.MAPLE,   ResonatorType.SPIDER,   5, "Fiberskyn")));
        inv.addInstrument(new Banjo("B015",  780, new BanjoSpec(Brand.IBANEZ,     "B300",            Wood.WALNUT,  ResonatorType.BISCUIT,  5, "Mylar")));
        inv.addInstrument(new Banjo("B016", 1300, new BanjoSpec(Brand.DEERING,    "Boston 17-Fret",  Wood.MAPLE,   ResonatorType.NONE,     6, "Mylar")));
        inv.addInstrument(new Banjo("B017", 2000, new BanjoSpec(Brand.GIBSON,     "Earl Scruggs",    Wood.MAPLE,   ResonatorType.SPIDER,   5, "Fiberskyn")));
        inv.addInstrument(new Banjo("B018",  820, new BanjoSpec(Brand.BLUEGRASS,  "BG-50",           Wood.MAHOGANY,ResonatorType.BISCUIT,  5, "Mylar")));
        inv.addInstrument(new Banjo("B019", 1050, new BanjoSpec(Brand.STELLING,   "Minstrel",        Wood.MAPLE,   ResonatorType.SPIDER,   5, "Fiberskyn")));
        inv.addInstrument(new Banjo("B020",  950, new BanjoSpec(Brand.DEERING,    "Eagle II",        Wood.MAPLE,   ResonatorType.SPIDER,   5, "Mylar")));
    }

    private static void addDobros(Inventory inv) {
        // 23 dobros
        inv.addInstrument(new Dobro("D001", 1200, new DobroSpec(Brand.NATIONAL,         "Style O",       Wood.MAPLE,    Wood.MAPLE,    ResonatorType.TRICONE,  6, "Metal")));
        inv.addInstrument(new Dobro("D002",  900, new DobroSpec(Brand.RESONATOR_PROS,   "RP-1",          Wood.SPRUCE,   Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D003", 1500, new DobroSpec(Brand.NATIONAL,         "Resolian",      Wood.MAPLE,    Wood.MAPLE,    ResonatorType.BISCUIT,  6, "Metal")));
        inv.addInstrument(new Dobro("D004",  700, new DobroSpec(Brand.GIBSON,           "Dobro 60",      Wood.SPRUCE,   Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D005",  850, new DobroSpec(Brand.GIBSON,           "Dobro 75",      Wood.MAPLE,    Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Fiberskyn")));
        inv.addInstrument(new Dobro("D006", 1100, new DobroSpec(Brand.RESONATOR_PROS,   "RP-2",          Wood.MAHOGANY, Wood.MAHOGANY, ResonatorType.BISCUIT,  6, "Mylar")));
        inv.addInstrument(new Dobro("D007", 2000, new DobroSpec(Brand.NATIONAL,         "Triolian",      Wood.MAPLE,    Wood.MAPLE,    ResonatorType.TRICONE,  6, "Metal")));
        inv.addInstrument(new Dobro("D008",  600, new DobroSpec(Brand.IBANEZ,           "DCF50",         Wood.SPRUCE,   Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D009",  750, new DobroSpec(Brand.IBANEZ,           "DCF100",        Wood.CEDAR,    Wood.MAHOGANY, ResonatorType.BISCUIT,  6, "Mylar")));
        inv.addInstrument(new Dobro("D010", 1300, new DobroSpec(Brand.NATIONAL,         "Style 97",      Wood.MAPLE,    Wood.MAPLE,    ResonatorType.TRICONE,  6, "Metal")));
        inv.addInstrument(new Dobro("D011",  950, new DobroSpec(Brand.RESONATOR_PROS,   "RP-3",          Wood.SPRUCE,   Wood.ROSEWOOD, ResonatorType.SPIDER,   6, "Fiberskyn")));
        inv.addInstrument(new Dobro("D012",  800, new DobroSpec(Brand.GIBSON,           "Dobro 90",      Wood.SPRUCE,   Wood.MAPLE,    ResonatorType.BISCUIT,  6, "Mylar")));
        inv.addInstrument(new Dobro("D013", 1700, new DobroSpec(Brand.NATIONAL,         "Duolian",       Wood.MAPLE,    Wood.MAPLE,    ResonatorType.BISCUIT,  6, "Metal")));
        inv.addInstrument(new Dobro("D014", 2400, new DobroSpec(Brand.NATIONAL,         "El Trovador",   Wood.MAPLE,    Wood.MAPLE,    ResonatorType.TRICONE,  6, "Metal")));
        inv.addInstrument(new Dobro("D015",  650, new DobroSpec(Brand.IBANEZ,           "DCF200",        Wood.SPRUCE,   Wood.WALNUT,   ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D016", 1100, new DobroSpec(Brand.RESONATOR_PROS,   "RP-4",          Wood.CEDAR,    Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D017",  900, new DobroSpec(Brand.GIBSON,           "Dobro 45",      Wood.SPRUCE,   Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Fiberskyn")));
        inv.addInstrument(new Dobro("D018", 1400, new DobroSpec(Brand.NATIONAL,         "Style 35",      Wood.MAPLE,    Wood.MAPLE,    ResonatorType.BISCUIT,  6, "Metal")));
        inv.addInstrument(new Dobro("D019",  850, new DobroSpec(Brand.RESONATOR_PROS,   "RP-5",          Wood.SPRUCE,   Wood.ROSEWOOD, ResonatorType.BISCUIT,  6, "Mylar")));
        inv.addInstrument(new Dobro("D020",  700, new DobroSpec(Brand.IBANEZ,           "DCF150",        Wood.CEDAR,    Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D021", 1800, new DobroSpec(Brand.NATIONAL,         "Reso-Phonic",   Wood.MAPLE,    Wood.MAPLE,    ResonatorType.TRICONE,  6, "Metal")));
        inv.addInstrument(new Dobro("D022",  780, new DobroSpec(Brand.GIBSON,           "Dobro 55",      Wood.SPRUCE,   Wood.MAHOGANY, ResonatorType.SPIDER,   6, "Mylar")));
        inv.addInstrument(new Dobro("D023", 1000, new DobroSpec(Brand.RESONATOR_PROS,   "RP-6",          Wood.MAHOGANY, Wood.ROSEWOOD, ResonatorType.BISCUIT,  6, "Fiberskyn")));
    }

    private static void addFiddles(Inventory inv) {
        // 27 fiddles
        inv.addInstrument(new Fiddle("F001",  450, new FiddleSpec(Brand.CREMONA,   "SV-175",   Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F002",  600, new FiddleSpec(Brand.CREMONA,   "SV-500",   Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F003",  800, new FiddleSpec(Brand.EASTMAN,   "VL80",     Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F004", 1100, new FiddleSpec(Brand.EASTMAN,   "VL305",    Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F005", 1400, new FiddleSpec(Brand.COLLINGS,  "290",      Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F006", 1800, new FiddleSpec(Brand.COLLINGS,  "291",      Wood.CEDAR,  Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F007",  350, new FiddleSpec(Brand.YAMAHA,    "V3",       Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F008",  500, new FiddleSpec(Brand.YAMAHA,    "V5",       Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F009",  900, new FiddleSpec(Brand.IBANEZ,    "V300",     Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F010", 1200, new FiddleSpec(Brand.EASTMAN,   "VL405",    Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F011",  750, new FiddleSpec(Brand.CREMONA,   "SV-600",   Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F012", 1050, new FiddleSpec(Brand.COLLINGS,  "292",      Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F013",  420, new FiddleSpec(Brand.YAMAHA,    "V7G",      Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F014",  680, new FiddleSpec(Brand.CREMONA,   "SV-700",   Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F015",  950, new FiddleSpec(Brand.EASTMAN,   "VL505",    Wood.CEDAR,  Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F016", 1300, new FiddleSpec(Brand.COLLINGS,  "MF5",      Wood.SPRUCE, Wood.MAPLE, 5, false)));
        inv.addInstrument(new Fiddle("F017", 1500, new FiddleSpec(Brand.EASTMAN,   "VL605",    Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F018",  870, new FiddleSpec(Brand.IBANEZ,    "V400",     Wood.MAPLE,  Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F019",  480, new FiddleSpec(Brand.YAMAHA,    "V10G",     Wood.SPRUCE, Wood.MAPLE, 4, false)));
        inv.addInstrument(new Fiddle("F020",  720, new FiddleSpec(Brand.CREMONA,   "SV-800",   Wood.MAPLE,  Wood.MAPLE, 4, false)));
        // Electric fiddles
        inv.addInstrument(new Fiddle("F021", 1100, new FiddleSpec(Brand.YAMAHA,    "YEV-104",  Wood.OTHER,  Wood.OTHER, 4, true)));
        inv.addInstrument(new Fiddle("F022", 1300, new FiddleSpec(Brand.YAMAHA,    "YEV-105",  Wood.OTHER,  Wood.OTHER, 5, true)));
        inv.addInstrument(new Fiddle("F023",  900, new FiddleSpec(Brand.IBANEZ,    "EV300",    Wood.OTHER,  Wood.OTHER, 4, true)));
        inv.addInstrument(new Fiddle("F024", 1500, new FiddleSpec(Brand.EASTMAN,   "EVL305",   Wood.OTHER,  Wood.OTHER, 4, true)));
        inv.addInstrument(new Fiddle("F025",  750, new FiddleSpec(Brand.CREMONA,   "SVE-175",  Wood.OTHER,  Wood.OTHER, 4, true)));
        inv.addInstrument(new Fiddle("F026", 2000, new FiddleSpec(Brand.COLLINGS,  "MF5-E",    Wood.OTHER,  Wood.OTHER, 5, true)));
        inv.addInstrument(new Fiddle("F027", 1700, new FiddleSpec(Brand.EASTMAN,   "EVL605",   Wood.OTHER,  Wood.OTHER, 4, true)));
    }

    // -----------------------------------------------------------------------
    // Search helpers
    // -----------------------------------------------------------------------

    private static void printResults(String searchTitle, List<Instrument> results) {
        System.out.println("========================================");
        System.out.println("Search: " + searchTitle);
        System.out.println("========================================");
        if (results.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Instrument instrument : results) {
                System.out.println("\nMatch Found");
                System.out.println(instrument);
                System.out.println("--------------------");
            }
            System.out.println("Total matches: " + results.size());
        }
        System.out.println();
    }

    // -----------------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------------

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        System.out.println("Populating inventory...");
        addMandolins(inventory);
        addGuitars(inventory);
        addBanjos(inventory);
        addDobros(inventory);
        addFiddles(inventory);
        System.out.println("Total instruments in inventory: " + inventory.getAllInstruments().size());
        System.out.println();

        // -------------------------------------------------------------------
        // Example 1: Mandolin, brand = Gibson, style = F
        // -------------------------------------------------------------------
        MandolinSpec wantedMandolin = new MandolinSpec(
                Brand.GIBSON,
                null,          // any model
                null,          // any topWood
                null,          // any backWood
                null,          // any type
                MandolinStyle.F
        );
        printResults("Mandolin — Brand: Gibson, Style: F",
                inventory.search(wantedMandolin));

        // -------------------------------------------------------------------
        // Example 2: Guitar, type = electric, numStrings = 6
        // -------------------------------------------------------------------
        GuitarSpec wantedGuitar = new GuitarSpec(
                null,                      // any brand
                null,                      // any model
                null,                      // any topWood
                null,                      // any backWood
                InstrumentType.ELECTRIC,   // must be electric
                6                          // must have 6 strings
        );
        printResults("Guitar — Type: Electric, Strings: 6",
                inventory.search(wantedGuitar));

        // -------------------------------------------------------------------
        // Example 3: Banjo, numStrings = 5
        // -------------------------------------------------------------------
        BanjoSpec wantedBanjo = new BanjoSpec(
                null,   // any brand
                null,   // any model
                null,   // any backWood
                null,   // any resonatorType
                5,      // must have 5 strings
                null    // any drumHeadMaterial
        );
        printResults("Banjo — Strings: 5",
                inventory.search(wantedBanjo));
    }
}
