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
public class Test_Terrain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Terrain newTerrain = new Terrain(5,5);
        System.out.println(newTerrain.toString());
        int[][] tab = new int[5][5];
        for (int i=0; i<5; i++){
            tab[i][i]=2;
        }
        
        
        
    }
    
}
