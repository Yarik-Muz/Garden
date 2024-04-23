package garden.plants.flowers;

import garden.colours.Colours;
import garden.plants.flowers.flowers;

public abstract class SunFlower extends flowers {

    public SunFlower(){

        super("SunFlower", 0.5);

    }

    public String colour(int season) {
        switch (season) {
            case 1:
                return Colours.BROWN;
            case 2:
                return Colours.YELLOW;
            case 3:
                return Colours.YELLOW;
            case 4:
                return Colours.BROWN;
            default:
                return Colours.NONE;
        }
    }

}
