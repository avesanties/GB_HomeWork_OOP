package services.impl;

import constants.Producers;
import data.impl.items.PowerUnit;
import services.PowerUnitFindable;

import java.util.ArrayList;
import java.util.List;

public class PowerUnitFindService implements PowerUnitFindable<PowerUnit> {
    private static List<PowerUnit> powerUnits = new ArrayList<>();

    static {
        powerUnits.add(new PowerUnit("AORUS GP-AP850GM", Producers.GIGABYTE, 850));
        powerUnits.add(new PowerUnit("GP-P1000GM", Producers.GIGABYTE, 1000));
        powerUnits.add(new PowerUnit("GP-UD850GM", Producers.GIGABYTE, 850));
        powerUnits.add(new PowerUnit("AORUS GP-AP750GM", Producers.GIGABYTE, 750));
    }

    @Override
    public PowerUnit findPowerUnit(int power) {
        if(powerUnits == null
        ||  powerUnits.size() == 0
        || power < 0)
            return null;

        for(PowerUnit pu : powerUnits){
            if (pu.getPower() >= power)
                return pu;
        }

        return null;
    }
}
