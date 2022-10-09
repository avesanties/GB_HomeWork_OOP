package services;

import data.impl.items.CPU;

public interface CPUFindable <T extends CPU> {
    T findCPU(int coreNumber, double frequency);
}
