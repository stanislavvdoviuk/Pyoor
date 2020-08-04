package Data;

public enum TimePeriod {
    ONE_YEAR("One year"),
    SIX_MONTHS("Six months"),
    THREE_MONTHS("Three months"),
    ONE_MONTH("One month");
    //
    private String name;

    private TimePeriod(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
