package data;

import constants.OperationSystems;
import data.impl.items.*;

public abstract class AbstractComputerBuilder<T extends AbstractComputerBuilder> {
    private RAM ram;

    private OperationSystems os;

    private Storage storage;

    private CPU cpu;

    private PowerUnit powerUnit;

    private Motherboard motherboard;

    protected AbstractComputerBuilder(){

    }

    public RAM getRam() {
        return ram;
    }

    public T setRam(RAM ram) {
        this.ram = ram;
        return (T) this;
    }

    public OperationSystems getOs() {
        return os;
    }

    public T setOs(OperationSystems os) {
        this.os = os;
        return (T) this;
    }

    public Storage getStorage() {
        return storage;
    }

    public T setStorage(Storage storage) {
        this.storage = storage;
        return (T) this;
    }

    public CPU getCpu() {
        return cpu;
    }

    public T setCpu(CPU cpu) {
        this.cpu = cpu;
        return (T) this;
    }

    public PowerUnit getPowerUnit() {
        return powerUnit;
    }

    public T setPowerUnit(PowerUnit powerUnit) {
        this.powerUnit = powerUnit;
        return (T) this;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public T setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        return (T) this;
    }

    protected abstract  <S extends AbstractComputer> S build();
}