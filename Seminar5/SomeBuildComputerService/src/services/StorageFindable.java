package services;

import data.impl.items.Storage;

public interface StorageFindable <T extends Storage> {
    T findStorage(int volume);
}
