/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourmiliere;

/**
 *
 * @author juanb
 */
public class Cellule {
    private Position positionCellule;
    private int valeurCellule;

    public Cellule(Position positionCellule) {
        this.positionCellule = positionCellule;
        this.valeurCellule=0;
    }

    @Override
    public String toString() {
        return "Cellule{" + "positionCellule=" + positionCellule + ", valeurCellule=" + valeurCellule + '}';
    }
    
    
    
}
