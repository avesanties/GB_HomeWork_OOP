package services;

import constants.MotherboardFormFactors;
import data.impl.items.Motherboard;

public interface MotherboardFindable <T extends Motherboard>{
    T findMotherboard(MotherboardFormFactors motherboardFormFactor);
}