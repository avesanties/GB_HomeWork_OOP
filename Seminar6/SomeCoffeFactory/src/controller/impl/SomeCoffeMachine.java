package controller.impl;

import constants.CoffeeTypes;
import controller.AbstractCoffeeMachine;
import data.AbstractCoffee;
import data.coffeDrinkBuilders.AmericanoBuilder;
import data.coffeDrinkBuilders.ColdCoffeeBuilder;
import data.coffeDrinkBuilders.EspressoBuilder;
import data.coffeDrinkBuilders.GingerLatteBuilder;

public class SomeCoffeMachine extends AbstractCoffeeMachine {
    private AmericanoBuilder americanoBuilder;

    private ColdCoffeeBuilder coldCoffeeBuilder;

    private EspressoBuilder espressoBuilder;

    private GingerLatteBuilder gingerLatteBuilder;

    public SomeCoffeMachine() {
        this.americanoBuilder = new AmericanoBuilder();
        this.coldCoffeeBuilder = new ColdCoffeeBuilder();
        this.espressoBuilder = new EspressoBuilder();
        this.gingerLatteBuilder = new GingerLatteBuilder();
    }

    @Override
    public <T extends AbstractCoffee> T makeCoffee(CoffeeTypes ct) {
        switch (ct){
            case AMERICANO:
                americanoBuilder.setCoffeeType("Молотый кофе.");
                americanoBuilder.setWater("70 мл воды");
                americanoBuilder.setTemperature("Вода о 80 градусах");
                americanoBuilder.setSugar("Без сахара");
                americanoBuilder.setExtraHotWater("Дополнительный объем воды");
                return (T) americanoBuilder.build();
            case COLDCOFFEE:
                coldCoffeeBuilder.setCoffeeType("Молотый кофе");
                coldCoffeeBuilder.setWater("80 мл воды");
                coldCoffeeBuilder.setTemperature("Вода о 20 градусах");
                coldCoffeeBuilder.setSugar("Без сахара");
                coldCoffeeBuilder.setMilk("150 мл молока");
                coldCoffeeBuilder.setCream("50 мл сливок");
                coldCoffeeBuilder.setHazelnut("5 гр лесного ореха");
                return (T) coldCoffeeBuilder.build();
            case ESPRESSO:
                espressoBuilder.setCoffeeType("Молотый кофе");
                espressoBuilder.setWater("70 мл воды");
                espressoBuilder.setTemperature("Вода о 85 градусах");
                espressoBuilder.setSugar("1 ложка сахара");
                espressoBuilder.setStateOfCoffee("Сдавленный в таблетку кофе");
                return (T) espressoBuilder.build();
            case GINGERLATTE:
                gingerLatteBuilder.setCoffeeType("Молотый кофе");
                gingerLatteBuilder.setWater("80 мл воды");
                gingerLatteBuilder.setTemperature("вода о 80 градусах");
                gingerLatteBuilder.setSugar("2 ложки сахара");
                gingerLatteBuilder.setGingerSyrup("50 мл имбирного сиропа");
                gingerLatteBuilder.setDryHibiscus("15 г сухого каркаде");
                return (T) gingerLatteBuilder.build();
                default:
                return null;
        }
    }
}
