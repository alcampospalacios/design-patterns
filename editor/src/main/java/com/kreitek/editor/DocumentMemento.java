package com.kreitek.editor;

import java.util.ArrayList;

/**
 * Memento: Almacena el estado del documento en un momento específico
 */
public class DocumentMemento {
    private final ArrayList<String> state;

    public DocumentMemento(ArrayList<String> documentLines) {
        this.state = new ArrayList<>(documentLines);
    }

    public ArrayList<String> getState() {
        return new ArrayList<>(state);
    }
}
