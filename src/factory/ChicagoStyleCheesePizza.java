/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

public class ChicagoStyleCheesePizza extends Pizza{
     public ChicagoStyleCheesePizza(){
        name = "Pizza de queijo prato estilo Chicago";
        dough = "Massa de borda grossa - extra";
        sauce = "Molho de Tomate Ameixa";
        
        toppings.add("Queijo mussarela ralado");
    }
    void cut(){
        System.out.println("Cortando a pizza em fatias quadradas");
    }
}
