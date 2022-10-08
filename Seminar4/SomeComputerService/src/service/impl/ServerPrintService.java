package service.impl;

import service.Printable;
import data.impl.Server;

import java.util.List;

public class ServerPrintService implements Printable<Server> {
    @Override
    public void print(List<Server> computers) {
        logger.info(computers.toString());
    }
}
