/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author 1-2021221706
 */
public class NYPizzaStore extends PizzaStore{

    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else if(item.equals("clam")){
            return new NYStyleClamPizza();
        }else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else return null;
    }
    
}
