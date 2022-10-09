package services.impl;

import constants.MotherboardFormFactors;
import constants.Producers;
import data.impl.items.Motherboard;
import services.MotherboardFindable;

import java.util.ArrayList;
import java.util.List;

public class MotherboardFindService implements MotherboardFindable<Motherboard> {
    private static List<Motherboard> motherboards = new ArrayList<>();

    static {
        motherboards.add(new Motherboard("PRIME H510M-K", Producers.ASUS, MotherboardFormFactors.MICROATX));
        motherboards.add(new Motherboard("MSI H510M PRO-E", Producers.MSI, MotherboardFormFactors.MICROATX));
        motherboards.add(new Motherboard("Z590 GAMING X", Producers.GIGABYTE, MotherboardFormFactors.ATX));
        motherboards.add(new Motherboard("PRIME H610I-PLUS D4-CSM", Producers.ASUS, MotherboardFormFactors.MINIITX));
        motherboards.add(new Motherboard("PRO Z690-A WIFI DDR4", Producers.MSI, MotherboardFormFactors.ATX));
    }

    @Override
    public Motherboard findMotherboard(MotherboardFormFactors motherboardFormFactor) {
        if (motherboards == null
            || motherboards.size() == 0
            || motherboardFormFactor == null)
            return null;

        for(Motherboard mb : motherboards){
            if(mb.getMotherboardFormFactor() == motherboardFormFactor)
                return mb;
        }

        return null;
    }
}
