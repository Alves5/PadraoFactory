/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author 1-2021221706
 */
public class ClamPizza extends Pizza{

     @Override
    public void preparar() {
        System.out.println("Preparando a pizza de Clam.");
    }

    @Override
    public void assar() {
        System.out.println("Assando.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortada.");
    }

    @Override
    public void encaixar() {
        System.out.println("Pizza na caixa.");
    }
    
}
