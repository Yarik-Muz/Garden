package garden.colours;

public enum Season {
    WINTER(0), SPRING(1), SUMMER(2), AUTUMN(3);

    private final int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
