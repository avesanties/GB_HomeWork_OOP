package services.impl;

import constants.Producers;
import data.impl.items.CPU;
import services.CPUFindable;

import java.util.ArrayList;
import java.util.List;

public class CPUFindService implements CPUFindable<CPU> {
    private static List<CPU> CPUs = new ArrayList<>();
    static {
        CPUs.add(new CPU("Ryzen 5 2600", Producers.AMD, 6,3.4));
        CPUs.add(new CPU("Intel Core i5 12400F", Producers.INTEL, 6,2.5));
        CPUs.add(new CPU("Ryzen 9 5900X", Producers.AMD, 12,3.7));
        CPUs.add(new CPU("AMD Ryzen 7 3800X", Producers.AMD, 8,3.9));
        CPUs.add(new CPU("Intel Core i7 12700", Producers.INTEL, 12,2.1));
    }

    @Override
    public CPU findCPU(int coreNumber, double frequency) {
        if(CPUs == null
        || CPUs.size() == 0
        || coreNumber < 0
        || frequency < 0) return null;

        for(CPU cpu : CPUs){
            if( cpu.getFrequency() >= frequency && cpu.getCoreNumber() >= coreNumber)
                return cpu;
        }

        return null;
    }
}
