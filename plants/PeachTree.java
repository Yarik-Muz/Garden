package garden.plants;

import garden.colours.Colours;

public abstract class PeachTree extends trees{

    public PeachTree(){

        super("Peach Tree");

    }

    @Override
    public String getFruit(){

        return "peach";

    }

    public String colour(int season) {
        switch (season) {
            case 1:
                return Colours.BROWN;
            case 2:
                return Colours.PINK;
            case 3:
                return Colours.GREEN;
            case 4:
                return Colours.YELLOW;
            default:
                return Colours.NONE;
        }
    }

}
