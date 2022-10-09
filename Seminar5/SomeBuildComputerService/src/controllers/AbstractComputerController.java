package controllers;

import data.impl.items.*;
import services.*;
import services.impl.*;

public abstract class AbstractComputerController {
    private CPUFindable<CPU> CPUFindService;

    private MotherboardFindable<Motherboard> MotherBoardFindService;

    private PowerUnitFindable<PowerUnit> PowerUnitFindService;

    private RAMFindable<RAM> RAMFindService;

    private StorageFindable<Storage> StorageFindableService;

    protected AbstractComputerController(){
        this.CPUFindService = new CPUFindService();
        this.MotherBoardFindService = new MotherboardFindService();
        this.StorageFindableService = new StorageFindService();
        this.PowerUnitFindService = new PowerUnitFindService();
        this.RAMFindService = new RAMFindService();
    }

    public CPUFindable<CPU> getCPUFindService() {
        return CPUFindService;
    }

    public MotherboardFindable<Motherboard> getMotherBoardFindService() {
        return MotherBoardFindService;
    }

    public PowerUnitFindable<PowerUnit> getPowerUnitFindService() {
        return PowerUnitFindService;
    }

    public RAMFindable<RAM> getRAMFindService() {
        return RAMFindService;
    }

    public StorageFindable<Storage> getStorageFindableService() {
        return StorageFindableService;
    }
}
