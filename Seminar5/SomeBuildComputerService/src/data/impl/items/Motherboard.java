package data.impl.items;

import constants.MotherboardFormFactors;
import constants.Producers;
import data.AbstractComputerItem;

public class Motherboard extends AbstractComputerItem {

    private MotherboardFormFactors motherboardFormFactor;

    public Motherboard(String model, Producers producer, MotherboardFormFactors motherboardFormFactor) {
        super(model, producer);
        this.motherboardFormFactor = motherboardFormFactor;
    }

    public MotherboardFormFactors getMotherboardFormFactor() {
        return this.motherboardFormFactor;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", motherboardFormFactor=" + motherboardFormFactor;
    }
}
