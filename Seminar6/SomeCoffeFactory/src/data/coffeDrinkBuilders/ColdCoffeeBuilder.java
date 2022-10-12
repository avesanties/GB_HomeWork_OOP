package data.coffeDrinkBuilders;

import data.AbstractCoffeeBuilder;
import data.impl.coffeeDrinks.ColdCoffee;

public final class ColdCoffeeBuilder extends AbstractCoffeeBuilder<ColdCoffeeBuilder> {

    private String milk;

    private String cream;

    private String hazelnut;

    public ColdCoffeeBuilder() {

    }

    public String getMilk() {
        return milk;
    }

    public ColdCoffeeBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public String getCream() {
        return cream;
    }

    public ColdCoffeeBuilder setCream(String cream) {
        this.cream = cream;
        return this;
    }

    public String getHazelnut() {
        return hazelnut;
    }

    public ColdCoffeeBuilder setHazelnut(String hazelnut) {
        this.hazelnut = hazelnut;
        return this;
    }

    @Override
    public ColdCoffee build() {
        return new ColdCoffee(this);
    }
}
