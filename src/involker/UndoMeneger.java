/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package involker;

import Command.Command;
import java.util.Stack;

/**
 *
 * @author Win-7
 */
public class UndoMeneger {
    private Stack<Command> undoStack = new Stack<Command>();
    private Stack<Command> redoStack = new Stack<Command>();
    private Stack<Command> historicoStack = new Stack<Command>();

    public Stack<Command> getUndoStack() {
        return undoStack;
    }

    public Stack<Command> getRedoStack() {
        return redoStack;
    }
    
    public Stack<Command> getHistoricoStack() {
        return historicoStack;
    }

    public void execute(Command command) {
        command.execute();
        undoStack.push(command);
        historicoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            try {
                Command command = undoStack.pop();
                command.undo();
                redoStack.push(command);
            } catch (IllegalStateException e) {
            }
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            try {
                Command command = redoStack.pop();
                command.redo();
                undoStack.push(command);
            } catch (IllegalStateException e) {
            }
        }
    }

    public boolean isUndoAvailable() {
        return !undoStack.isEmpty();
    }

    public boolean isRedoAvailable() {
        return !redoStack.isEmpty();
    }
}
