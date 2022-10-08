package Service.impl;

import Service.Printable;
import data.Computer;

import java.util.List;

public class ComputerPrintService implements Printable<Computer> {
    @Override
    public void print(List<Computer> computers) {
        logger.info(computers.toString());
    }
}
