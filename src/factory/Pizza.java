/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1-2021221706
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    
    public void preparar(){
        System.out.println("Preparando "+name);
        System.out.println("Jogando massa...");
        System.out.println("Adicionando molho...");
        System.out.println("Adicionando coberturas: ");
        for (String topping : toppings) {
            System.out.println(" "+topping);
        }
    };
    public void assar(){
        System.out.println("Assar por 25 minutos em 350°.");
    };
    public void cortar(){
        System.out.println("Cortando a pizza na diagonal.");
    };
    public void encaixar(){
        System.out.println("Colocando a pizza na caixa.");
    };
    public String getName(){
        return name;
    }
}
