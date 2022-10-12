package data.coffeDrinkBuilders;

import data.AbstractCoffee;
import data.AbstractCoffeeBuilder;
import data.impl.coffeeDrinks.GingerLatte;

public final class GingerLatteBuilder extends AbstractCoffeeBuilder<GingerLatteBuilder> {
    private String milk;

    private String gingerSyrup;

    private String dryHibiscus;

    public GingerLatteBuilder() {

    }

    public String getMilk() {
        return milk;
    }

    public GingerLatteBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public String getGingerSyrup() {
        return gingerSyrup;
    }

    public GingerLatteBuilder setGingerSyrup(String gingerSyrup) {
        this.gingerSyrup = gingerSyrup;
        return this;
    }

    public String getDryHibiscus() {
        return dryHibiscus;
    }

    public GingerLatteBuilder setDryHibiscus(String dryHibiscus) {
        this.dryHibiscus = dryHibiscus;
        return this;
    }

    @Override
    public GingerLatte build() {
        return new GingerLatte(this);
    }
}
