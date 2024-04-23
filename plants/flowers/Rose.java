package garden.plants.flowers;
import com.sun.source.tree.BreakTree;
import garden.colours.Colours;
import garden.Garden.*;
public abstract class Rose extends flowers{
    private String colour;

    public Rose(String color) {
        super("Rose", 0.4);
        this.colour = colour;
    }

    public String colour(int season) {
        switch (season) {
            case 1:
                return Colours.BROWN;
            case 2:
                return Colours.RED;
            case 3:
                return Colours.RED;
            case 4:
                return Colours.BROWN;
            default:
                return Colours.NONE;
        }
    }

}
