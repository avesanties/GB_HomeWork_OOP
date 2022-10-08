package Service.impl;

import Service.Printable;
import data.impl.Desktop;

import java.util.List;

public class DesktopPrintService implements Printable<Desktop> {
    @Override
    public void print(List<Desktop> computers) {
        logger.info(computers.toString());
    }
}
