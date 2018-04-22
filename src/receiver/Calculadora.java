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

    public Calculadora() {
        this.num1 = 0;
    }
    
    public void somar(double num){
        num1 +=num;
    }
    
    public void subtrair(double num){
        num1 -=num;
    }
    
//    public void multiplicacao(){
//         num1 * num2;
//    }
//    
//    public void divisao(){
//         num1 / num2;
//    }
    
}
