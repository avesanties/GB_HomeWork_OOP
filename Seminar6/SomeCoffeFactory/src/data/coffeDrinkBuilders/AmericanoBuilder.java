package data.coffeDrinkBuilders;

import data.AbstractCoffeeBuilder;
import data.impl.coffeeDrinks.Americano;

public final class AmericanoBuilder extends AbstractCoffeeBuilder<AmericanoBuilder> {
    private String extraHotWater;

    public AmericanoBuilder(){

    }

    public String getExtraHotWater() {
        return extraHotWater;
    }

    public AmericanoBuilder setExtraHotWater(String extraHotWater) {
        this.extraHotWater = extraHotWater;
        return this;
    }

    @Override
    public Americano build() {
        return new Americano(this);
    }
}
