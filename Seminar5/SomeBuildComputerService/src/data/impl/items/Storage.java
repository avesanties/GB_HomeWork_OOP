package data.impl.items;

import constants.Producers;
import data.AbstractComputerItem;

public class Storage extends AbstractComputerItem {
    private final int volume;

    public Storage(String model, Producers producer, int volume) {
        super(model, producer);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()
                + "volume=" + volume;
    }
}
