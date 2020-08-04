package Data;

public enum ServiceFrequency {
    WEEKLY("Weekly"),
    BI_WEEKLY("Bi-weekly"),
    MONTHLY("Monthly"),
    ONE_TIME("One time");
    //
    private String name;

    private ServiceFrequency(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
