package services;

import data.impl.items.RAM;

public interface RAMFindable <T extends RAM>{
    T findRAM(int volume);
}
