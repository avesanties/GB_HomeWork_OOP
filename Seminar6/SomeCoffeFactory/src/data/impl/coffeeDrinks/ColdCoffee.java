package data.impl.coffeeDrinks;

import data.AbstractCoffee;
import data.coffeDrinkBuilders.ColdCoffeeBuilder;

public final class ColdCoffee extends AbstractCoffee{
    private String milk;

    private String cream;

    private String hazelnut;

    public ColdCoffee(ColdCoffeeBuilder b) {
        super(b);
        this.milk = b.getMilk();
        this.cream = b.getCream();
        this.hazelnut = b.getHazelnut();
    }
}
