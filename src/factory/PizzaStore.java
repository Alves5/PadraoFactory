/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author 1-2021221706
 */
public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = createPizza(type);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.encaixar();
        
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
