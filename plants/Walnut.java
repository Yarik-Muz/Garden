package garden.plants;

import garden.colours.Colours;

public abstract class Walnut extends trees{

    public Walnut(){

        super("Walnut");

    }

    @Override
    public String getFruit(){

        return "nut";

    }

    public String colour(int season) {
        switch (season) {
            case 1:
                return Colours.BROWN;
            case 2, 3:
                return Colours.GREEN;
            case 4:
                return Colours.YELLOW;
            default:
                return Colours.NONE;
        }
    }

}
