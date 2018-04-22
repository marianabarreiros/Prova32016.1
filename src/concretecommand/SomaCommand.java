/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecommand;

import Command.Command;
import receiver.Calculadora;
import iterator.Iterator;

/**
 *
 * @author Win-7
 */
public class SomaCommand implements Command{
    private Calculadora calc;
    private double num;
    

    public SomaCommand(Calculadora calc, double num) {
        this.calc = calc;
        this.num = num;
    }
    
    
    @Override
    public void execute() {
        calc.somar(num);
    }

    @Override
    public void undo() {
        calc.subtrair(num);
    }

    @Override
    public void redo() {
        execute();
    }

    
}
