package garden.plants;

public class Plant {
    String name;
    final double dailyWaterConsumption;

    public Plant(String name, double dailyWaterConsumption) {
        this.name = name;
        this.dailyWaterConsumption = dailyWaterConsumption;
    }

    public double waterConsumption(int days) {
        return this.dailyWaterConsumption * days;
    }

    public String getName() {
        return this.name;
    }
}
