package data;

import constants.Producers;

public abstract class AbstractComputerItem {
    private final String model;

    private final Producers producer;

    protected AbstractComputerItem(String model, Producers producer){
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public Producers getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", producer=" + producer;
    }
}