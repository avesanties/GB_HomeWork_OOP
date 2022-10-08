package Service.impl;

import Service.Printable;
import data.impl.Notebook;

import java.util.List;

public class NotebookPrintService implements Printable<Notebook> {
    @Override
    public void print(List<Notebook> computers) {
        logger.info(computers.toString());
    }
}
