package garden;

public abstract class tiles {

    String colour;
    boolean isGlossy;
    String name;

    public tiles(String name, String colour, boolean isGlossy) {
        this.name = name;
        this.colour = colour;
        this.isGlossy = isGlossy;
    }

    @Override
    public String toString() {
        return isGlossy ? "(" + this.colour + ")" : this.colour;
    }

    public String getName() {
        return this.name;
    }

}
