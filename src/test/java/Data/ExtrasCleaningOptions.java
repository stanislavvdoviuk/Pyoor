package Data;

public enum ExtrasCleaningOptions {
    LAUNDRY("Laundry"),
    INSIDE_OF_WINDOWS("Inside of windows"),
    INSIDE_CABINETS("Inside cabinets"),
    INSIDE_THE_OVEN("Inside the oven"),
    INSIDE_FRIDGE("Inside fridge");

    //
    private String name;

    private ExtrasCleaningOptions(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
