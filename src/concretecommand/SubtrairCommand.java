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
public class SubtrairCommand implements Command{
    private Calculadora calc;
    private double num;

    public SubtrairCommand(Calculadora calc, double num) {
        this.calc = calc;
        this.num = num;
    }
                      
    @Override
    public void execute() {
        calc.subtrair(num);
    }

    @Override
    public void undo() {
        calc.somar(num);
    }

    @Override
    public void redo() {
        execute();
    }
}
