/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author 1-2021221706
 */
public class PizzaMain {
    public static void main(String args[]){
        PizzaStore p = new PizzaStore(new SimplePizzaFactory());
        p.orderPizza("cheese");
        System.out.println(p);
        
    }
}
