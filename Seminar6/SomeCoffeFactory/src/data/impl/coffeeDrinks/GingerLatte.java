package data.impl.coffeeDrinks;

import data.AbstractCoffee;
import data.coffeDrinkBuilders.GingerLatteBuilder;

public final class GingerLatte extends AbstractCoffee {
    private String milk;

    private String gingerSyrup;

    private String dryHibiscus;
    public GingerLatte(GingerLatteBuilder b) {
        super(b);
        this.milk = b.getMilk();
        this.gingerSyrup = b.getGingerSyrup();
        this.dryHibiscus = b.getDryHibiscus();
    }

    public String getMilk() {
        return milk;
    }

    public String getGingerSyrup() {
        return gingerSyrup;
    }

    public String getDryHibiscus() {
        return dryHibiscus;
    }
}