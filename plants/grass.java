package garden.plants;

public abstract class grass extends Plant{

    public grass(String name){

        super(name, 0.3);

    }

    public abstract String colour();

}
