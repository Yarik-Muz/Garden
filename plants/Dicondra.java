package garden.plants;

import garden.colours.Colours;

public abstract class Dicondra extends grass{

    public Dicondra(){

        super("Dicondra");

    }

    public String colour(int season) {
        switch (season) {
            case 1, 2, 3, 4:
                return Colours.GREEN;
            default:
                return Colours.NONE;
        }
    }

}
