/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Command.Command;
import concretecommand.SomaCommand;
import concretecommand.SubtrairCommand;
import concreteiterators.ICommandIterator;
import involker.UndoMeneger;
import java.util.Stack;
import receiver.Calculadora;
import iterator.Iterator;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        Command soma = new SomaCommand(calc,6);
        Command sub = new SubtrairCommand(calc,4.9);

        UndoMeneger meneger = new UndoMeneger();
        meneger.execute(soma);
        meneger.execute(soma);
        meneger.execute(sub);
        
        meneger.undo();
        meneger.undo();
        meneger.redo();
        
        Stack<Command> undoStack = new Stack<Command>(); //histórico
	Stack<Command> redoStack = new Stack<Command>();
	Stack<Command> historicoStack = new Stack<Command>();
       
        System.out.println(meneger.getUndoStack());
        System.out.println(meneger.getRedoStack());
        System.out.println(meneger.getHistoricoStack());
        
        Iterator i = new ICommandIterator(undoStack, SomaCommand.class);
//        
//        while (i.hasNext()){
//            Command c = i.next();
//        }
        
        
    }

}
