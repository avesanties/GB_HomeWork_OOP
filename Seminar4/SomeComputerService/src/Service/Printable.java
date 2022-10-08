package Service;

import data.Computer;

import java.util.List;
import java.util.logging.Logger;

public interface Printable<T extends Computer> {
    Logger logger = Logger.getAnonymousLogger();
    void print(List<T> computers);
}
