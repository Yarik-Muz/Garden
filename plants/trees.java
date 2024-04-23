package garden.plants;

public abstract class trees extends Plant{

    public trees(String name){

        super(name, 10);

    }

    public abstract String getFruit();
    public abstract String colour();
}

