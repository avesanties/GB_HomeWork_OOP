package data.coffeDrinkBuilders;

import data.AbstractCoffeeBuilder;
import data.impl.coffeeDrinks.Espresso;

public final class EspressoBuilder extends AbstractCoffeeBuilder<EspressoBuilder> {
    private String stateOfCoffee;

    public EspressoBuilder() {
    }

    public String getStateOfCoffee() {
        return stateOfCoffee;
    }

    public EspressoBuilder setStateOfCoffee(String stateOfCoffee) {
        this.stateOfCoffee = stateOfCoffee;
        return this;
    }

    @Override
    public Espresso build() {
        return new Espresso(this);
    }
}
