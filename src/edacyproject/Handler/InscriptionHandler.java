/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edacyproject.Handler;

import edacyproject.Classe.Classe;
import edacyproject.Classe.Etudiant;
import edacyproject.EdacyProject;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author sarrm
 */
public class InscriptionHandler {

    public static Collection<Etudiant> etudiants = new ArrayList<>();

    public static void menuPrincipal() {
        int choix;

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("***********************************");
            System.out.println("******Gestion des classes**********");
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("*** 1: inscrire un eleve  *********");
            System.out.println("*** 2: lister les eleves **********");
            System.out.println("*** Tapez autre chose pour quitter*");
            try {
                System.out.print("Faites votre choix: ");
                choix = Integer.parseInt(EdacyProject.in.nextLine());
            } catch (Exception e) {
                return;
            }
            switch (choix) {
                case 1:
                    inscrire();
                    break;
                case 2:
                    System.out.println();
                    System.out.println();
                    System.out.println("***liste des Etudiants **********");
                    System.out.println("***Nom**Prenom**Classe ***********");
                    if (etudiants.isEmpty())
                        System.out.println("Aucun etudiant dans le systeme");
                    etudiants.forEach(System.out::println);
                    break;
                default:
                    return;
            }
        }
    }

    public static void inscrire() {
        String prenom, nom, niveau, serie;

        System.out.println();
        System.out.println();
        System.out.print("Donner le prenom : ");
        prenom = EdacyProject.in.nextLine().trim();
        System.out.print("Donner le nom : ");
        nom = EdacyProject.in.nextLine().trim();
        System.out.print("Donner le niveau de la classe : ");
        niveau = EdacyProject.in.nextLine().trim();
        System.out.print("Donner la série de la classe : ");
        serie = EdacyProject.in.nextLine().trim();
        System.out.println();
        Classe c = null;
        for (Classe t : ClasseHandler.classes) {
            if (t.getNiveau().equalsIgnoreCase(niveau) && t.getSerie().equalsIgnoreCase(serie)) {
                c = t;
            }
        }
        if (c != null) {
            Etudiant e = new Etudiant(nom, prenom, c);
            etudiants.add(e);
            System.out.print("Inscription efective ");
        } else {
            System.out.print("Cette classse n'existe pas. Veuillez la creer d'abord");
        }
    }
}
