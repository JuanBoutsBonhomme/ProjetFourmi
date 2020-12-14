/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourmiliere;

import java.util.ArrayList;

/**
 *
 * @author juanb
 */
public class Terrain {
    private int nombreLigne;
    private int nombreColonne;
    private Cellule[][] terrain;

    public Terrain(int nombreLigne, int nombreColonne) {
        this.nombreLigne = nombreLigne;
        this.nombreColonne = nombreColonne;
        Cellule[][] terrain =new Cellule[nombreLigne][nombreColonne];
        for(int i=0; i<this.nombreLigne;i++){
            for(int j=0; j<this.nombreColonne;j++){
                Position pos = new Position(i,j);
                terrain[i][j] = new Cellule(pos);
            }
        }
        this.terrain = terrain;
    }

    @Override
    public String toString() {
        return "Terrain{" + "nombreLigne=" + nombreLigne + ", nombreColonne=" + nombreColonne + ", terrain=" + terrain + '}';
    }
    
    



    
    
}
