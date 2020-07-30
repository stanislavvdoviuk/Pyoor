package Data;

public enum TypesOfProperties {
    RESIDENTIAL("Residential"),
    COMMERCIAL("Commercial");
    //
    private String name;

    private TypesOfProperties(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
