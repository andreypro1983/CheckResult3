package ru.gb.model.handler;

import java.io.IOException;
import java.io.Serializable;

public interface Saveble {
    void save(String path, Serializable serializable) throws IOException;
}
