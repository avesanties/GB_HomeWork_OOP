package Service;

import constants.OperationSystems;
import data.Computer;

import java.util.ArrayList;
import java.util.List;

public interface SelectableByOS<T extends Computer> {
    List<T> SelectByOS(List<T> computers, OperationSystems os);
}
