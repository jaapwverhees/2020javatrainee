public enum Season {
    WINTER("cold"),
    SPRING("hotter"),
    SUMMER("hot"),
    FALL("colder");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
