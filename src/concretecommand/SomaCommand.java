/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecommand;

import Command.Command;
import receiver.Calculadora;

/**
 *
 * @author Win-7
 */
public class SomaCommand implements Command{
    private Calculadora calc;
    
    @Override
    public void execute() {
        calc.somar();
    }

    @Override
    public void undo() {
        calc.subtrair();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
