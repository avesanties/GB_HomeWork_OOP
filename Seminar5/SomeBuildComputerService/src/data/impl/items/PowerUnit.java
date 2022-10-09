package data.impl.items;

import constants.Producers;
import data.AbstractComputerItem;

public class PowerUnit extends AbstractComputerItem {
    private final int power;

    public PowerUnit(String model, Producers producer, int power) {
        super(model, producer);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", power=" + power;
    }
}
