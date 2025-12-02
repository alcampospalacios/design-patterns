package com.kreitek.editor.commands;

import java.util.ArrayList;

import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;


public class UndoCommand implements Command {
    private final ConsoleEditor editor;

    public UndoCommand(ConsoleEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        // El comando undo delega la lógica al editor
        editor.undo();
    }
}
