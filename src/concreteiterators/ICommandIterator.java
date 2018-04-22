/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteiterators;

import Command.Command;
import iterator.Iterator;
import java.util.Stack;

/**
 *
 * @author Win-7
 */
public class ICommandIterator implements Iterator{
    private Stack<Command> historico = new Stack<Command>();
    private Class<?> cla;

    public ICommandIterator(Stack<Command> historico, Class<?> cla) {
        this.historico = historico;
        this.cla = cla;
    }
    
    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
