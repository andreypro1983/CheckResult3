package ru.gb.model.handler;

import java.io.IOException;

public interface Loadable {
    public Object load(String path) throws IOException;
}

