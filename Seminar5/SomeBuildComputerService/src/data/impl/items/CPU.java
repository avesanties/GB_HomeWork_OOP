package data.impl.items;

import constants.Producers;
import data.AbstractComputerItem;

public class CPU extends AbstractComputerItem {
    private final int coreNumber;
    private final double frequency;

    public CPU(String model, Producers producer, int coreNumber, double frequency) {
        super(model, producer);
        this.coreNumber = coreNumber;
        this.frequency = frequency;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return  super.toString()
                + ", coreNumber=" + coreNumber +
                ", frequency=" + frequency;
    }
}
