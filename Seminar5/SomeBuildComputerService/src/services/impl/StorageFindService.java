package services.impl;

import constants.Producers;
import data.impl.items.Storage;
import services.StorageFindable;

import java.util.ArrayList;
import java.util.List;

public class StorageFindService implements StorageFindable<Storage> {
    private static List<Storage> storages = new ArrayList<>();

    static {
        storages.add(new Storage("Radeon R5 R5SL240G", Producers.AMD, 240));
        storages.add(new Storage("DELL 1 х 750ГБ", Producers.DELL, 750));
        storages.add(new Storage("D3-S4520 SSDSC2KB480GZ01", Producers.INTEL, 480));
        storages.add(new Storage("A400 SA400S37", Producers.KINGSTON, 480));
    }

    @Override
    public Storage findStorage(int volume) {
        if(storages == null
            || storages.size() == 0
            || volume < 0)
            return null;

        for(Storage st : storages){
            if(st.getVolume() >= volume)
                return st;
        }

        return null;
    }
}
