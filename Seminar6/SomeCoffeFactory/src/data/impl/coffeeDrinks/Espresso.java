package data.impl.coffeeDrinks;

import data.AbstractCoffee;
import data.coffeDrinkBuilders.EspressoBuilder;

public final class Espresso extends AbstractCoffee {
    private String stateOfCoffee;

    public Espresso(EspressoBuilder b) {
        super(b);
        this.stateOfCoffee = b.getStateOfCoffee();
    }

    public String getStateOfCoffee() {
        return stateOfCoffee;
    }
}