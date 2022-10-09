package services.impl;

import constants.Producers;
import data.impl.items.RAM;
import services.RAMFindable;

import java.util.ArrayList;
import java.util.List;

public class RAMFindService implements RAMFindable<RAM> {
    private static List<RAM> RAMs = new ArrayList<>();

    static {
        RAMs.add(new RAM("Radeon R7 Performance Series", Producers.AMD, 16));
        RAMs.add(new RAM("R3 Value", Producers.AMD, 4));
        RAMs.add(new RAM("Radeon R7 Performance Series", Producers.AMD, 32));
    }

    @Override
    public RAM findRAM(int volume) {
        if(RAMs == null
        || RAMs.size() == 0
        || volume < 0)
            return null;

        for(RAM ram : RAMs){
            if(ram.getVolume() == volume)
                return ram;
        }

        return null;
    }
}
