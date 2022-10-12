package controller;

import constants.CoffeeTypes;
import data.AbstractCoffee;

public abstract class AbstractCoffeeMachine {

    protected AbstractCoffeeMachine() {
    }

    public abstract <T extends AbstractCoffee> T makeCoffee(CoffeeTypes ct);
}