/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author 1-2021221706
 */
public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name = "Pizza de marisco estilo Chicago";
        dough = "Massa de borda grossa - extra";
        sauce = "Molho de Tomate Ameixa";
        
        toppings.add("Queijo mussarela ralado");
    }
    void cut(){
        System.out.println("Cortando a pizza em fatias quadradas");
    }
}
