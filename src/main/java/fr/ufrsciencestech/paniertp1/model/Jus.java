/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.model;

import fr.ufrsciencestech.paniertp1.Fruit;

/**
 *
 * @author dc306526
 */
public class Jus {
    private Fruit fruit;
    
    public Jus(Fruit f){
        this.fruit = f;
    }
    
    public boolean isSeedless(){
        boolean isSeedless = false;
        if(this.fruit.isSeedless()) isSeedless = true;
        return isSeedless;
    }
    
    public String toString(){
        String s = "";
        s += "jus de "+this.fruit.toString();
        return s;
    }
    
    public double getPrix(){
        double prix = this.fruit.getPrix();
        return prix;
    }
}
