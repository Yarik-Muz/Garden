package garden.plants;

import garden.colours.Colours;

public class Fir extends trees{

    public Fir(){

        super("Fir");

    }

    @Override
    public String getFruit(){

        return "";

    }

    public String colour(int season) {
        switch (season) {
            case 1:
                return Colours.GREEN;
            case 2:
                return Colours.GREEN;
            case 3:
                return Colours.GREEN;
            case 4:
                return Colours.GREEN;
            default:
                return Colours.NONE;
        }
    }

}
