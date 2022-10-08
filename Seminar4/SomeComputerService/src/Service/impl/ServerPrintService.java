package Service.impl;

import Service.Printable;
import data.Computer;
import data.impl.Server;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class ServerPrintService implements Printable<Server> {
    @Override
    public void print(List<Server> computers) {
        logger.info(computers.toString());
    }
}
