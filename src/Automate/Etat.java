/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

/**
 *
 * @author Maxime
 */
public class Etat {
    String nom_etat;
    boolean estFinal;
    
    public Etat (String nom_etat, boolean estFinal){
        this.nom_etat = nom_etat;
        this.estFinal = estFinal;
    }
    
    public Etat (String nom_etat){
        this(nom_etat,false);
    }
    
    public boolean estFinal(){
        return estFinal;
    }
    
    public String toString(){
        return nom_etat;
    }
}
