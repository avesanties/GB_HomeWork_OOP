package data.impl.coffeeDrinks;

import data.AbstractCoffee;
import data.coffeDrinkBuilders.AmericanoBuilder;

public final class Americano extends AbstractCoffee {
    private String extraHotWater;

    public Americano(AmericanoBuilder b) {
        super(b);

        this.extraHotWater = b.getExtraHotWater();
    }


}
