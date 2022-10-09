package controllers.impl;

import constants.MotherboardFormFactors;
import constants.OperationSystems;
import controllers.AbstractComputerController;
import data.impl.computers.Desktop;
import data.impl.computers.DesktopBuilder;

public class DesktopBuilderController extends AbstractComputerController {

    public DesktopBuilderController(){
        super();
    }

    public Desktop BuidDesktopByCriteria(
            double frequency
            ,int coreNumber
            ,MotherboardFormFactors motherboardFormFactor
            ,OperationSystems os
            ,int power
            ,int RAMVolume
            ,int storageVolume){

        DesktopBuilder db = new DesktopBuilder();

        return db.setCpu(this.getCPUFindService().findCPU(coreNumber, frequency))
                .setMotherboard(this.getMotherBoardFindService().findMotherboard(motherboardFormFactor))
                .setOs(os)
                .setPowerUnit(this.getPowerUnitFindService().findPowerUnit(power))
                .setRam(this.getRAMFindService().findRAM(RAMVolume))
                .setStorage(this.getStorageFindableService().findStorage(storageVolume))
                .build();
    }
}
