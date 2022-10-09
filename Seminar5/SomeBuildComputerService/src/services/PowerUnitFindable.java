package services;

import data.impl.items.PowerUnit;

public interface PowerUnitFindable <T extends PowerUnit> {
    T findPowerUnit(int power);
}
