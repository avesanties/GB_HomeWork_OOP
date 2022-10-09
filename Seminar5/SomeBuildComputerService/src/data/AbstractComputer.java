package data;

import constants.OperationSystems;
import data.impl.items.*;

public abstract class AbstractComputer{
    private RAM ram;
    private OperationSystems os;
    private Storage storage;
    private CPU cpu;
    private PowerUnit powerUnit;

    private Motherboard motherboard;
    protected AbstractComputer(AbstractComputerBuilder<? extends AbstractComputerBuilder> b){
        this.ram = b.getRam();
        this.os = b.getOs();
        this.storage = b.getStorage();
        this.cpu = b.getCpu();
        this.powerUnit = b.getPowerUnit();
        this.motherboard = b.getMotherboard();
    }

    @Override
    public String toString() {
        return  getClass() +"{" +
                "\nram: " + ram +
                "\n,os: " + os +
                "\n,storage: " + storage +
                "\n,cpu: " + cpu +
                "\n,powerUnit: " + powerUnit +
                "\n,motherboard: " + motherboard +
                "\n}";
    }
}