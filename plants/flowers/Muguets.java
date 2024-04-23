package garden.plants.flowers;

import garden.colours.Colours;
import garden.plants.flowers.flowers;

public abstract class Muguets extends flowers {

    private String colour;

    public Muguets(String color) {
        super("Muguets", 0.3);
        this.colour = colour;
    }

    public String colour(int season) {
        switch (season) {
            case 1:
                return Colours.NONE;
            case 2:
                return Colours.WHITE;
            case 3:
                return Colours.GREEN;
            case 4:
                return Colours.NONE;
            default:
                return Colours.NONE;
        }
    }

}
