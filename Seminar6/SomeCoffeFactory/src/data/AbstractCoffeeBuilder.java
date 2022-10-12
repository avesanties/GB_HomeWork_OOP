package data;

public abstract class AbstractCoffeeBuilder<T extends AbstractCoffeeBuilder>{
    private String water;

    private String temperature;

    private String CoffeeType;

    private String sugar;

    public AbstractCoffeeBuilder() {

    }

    public String getWater() {
        return water;
    }

    public T setWater(String water) {
        this.water = water;
        return (T) this;
    }

    public String getTemperature() {
        return temperature;
    }

    public T setTemperature(String temperature) {
        this.temperature = temperature;
        return (T) this;
    }

    public String getCoffeeType() {
        return CoffeeType;
    }

    public T setCoffeeType(String coffeeType) {
        CoffeeType = coffeeType;
        return (T) this;
    }

    public String getSugar() {
        return sugar;
    }

    public T setSugar(String sugar) {
        this.sugar = sugar;
        return (T) this;
    }

    public abstract <S extends AbstractCoffee> S build();
}
