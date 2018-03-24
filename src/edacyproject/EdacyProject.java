/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edacyproject;

import edacyproject.Handler.ClasseHandler;
import edacyproject.Handler.InscriptionHandler;
import java.util.Scanner;

/**
 *
 * @author sarrm
 */
public class EdacyProject {
    public final static Scanner in = new Scanner(System.in);
    
    private static int menuPrincipal() {
        int choix;
        
        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("******Gestion de l'ecole*******");
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("*** 1: Gestion des classes  *******");
        System.out.println("*** 2: Gestion des etudiants ******");
        System.out.println("*** Tapez autre chose pour quitter*");
        try {
            System.out.print("Faites votre choix: ");
            choix = Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            return 3;
        }
        if (choix != 1 && choix != 2)
            choix = 3;
        return choix;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        while (( c = menuPrincipal()) != 3) {
            switch(c) {
                case 1:
                    ClasseHandler.menuPrincipal();
                    break;
                case 2:
                    InscriptionHandler.menuPrincipal();
            }
        }
        System.out.println("Au revoir");
        in.close();
    }

}
