package com.kreitek.editor;

import java.util.Stack;

public class EditorHistory {
    private final Stack<DocumentMemento> history = new Stack<>();

    public void push(DocumentMemento memento) {
        history.push(memento);
    }

    public DocumentMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
