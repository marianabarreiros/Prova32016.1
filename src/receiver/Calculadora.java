/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiver;

/**
 *
 * @author Win-7
 */
public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double somar(){
        return num1 + num2;
    }
    
    public double subtrair(){
        return num1 - num2;
    }
    
    public double multiplicacao(){
        return num1 * num2;
    }
    
    public double divisao(){
        return num1 / num2;
    }
    
}
