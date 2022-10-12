package data;

public abstract class AbstractCoffee {
    private String water;

    private String temperature;

    private String CoffeeState;

    private String sugar;

    protected AbstractCoffee(AbstractCoffeeBuilder<? extends AbstractCoffeeBuilder> b){
        this.water = b.getWater();
        this.temperature = b.getTemperature();
        this.CoffeeState = b.getCoffeeType();
        this.sugar = b.getSugar();
    }

    public String getWater() {
        return water;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getCoffeeState() {
        return CoffeeState;
    }

    public String getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return getClass() + "{" +
                "water='" + water + '\'' +
                ", temperature='" + temperature + '\'' +
                ", CoffeeState='" + CoffeeState + '\'' +
                ", sugar='" + sugar + '\'' +
                '}';
    }
}