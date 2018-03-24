/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edacyproject.Handler;

import edacyproject.Classe.Classe;
import edacyproject.EdacyProject;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author sarrm
 */
public class ClasseHandler {

    public static Collection<Classe> classes = new ArrayList<>();

    public static void menuPrincipal() {
        int choix;

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("***********************************");
            System.out.println("******Gestion des classes**********");
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("*** 1: ajouter une classes  *******");
            System.out.println("*** 2: modifier une classe ********");
            System.out.println("*** 3: supprimer une classe *******");
            System.out.println("*** 4: lister les classes **********");
            System.out.println("*** Tapez autre chose pour quitter*");
            try {
                System.out.print("Faites votre choix: ");
                choix = Integer.parseInt(EdacyProject.in.nextLine());
            } catch (Exception e) {
                return;
            }
            if (choix >= 1 && choix <= 3) {
                gestionClasse(choix);
            } else if (choix == 4) {
                System.out.println();
                System.out.println();
                System.out.println("***liste des classes **********");
                if (classes.isEmpty())
                    System.out.println("Aucune classe dans le systeme");

                classes.forEach(System.out::println);
            } else {
                return;
            }
        }
    }

    public static void gestionClasse(int choix) {
        String niveau, serie;
        Boolean test = false;

        System.out.println();
        System.out.println();
        System.out.println("Une classe est définie par son niveau et sa séries");
        System.out.print("Donner le niveau de la classe : ");
        niveau = EdacyProject.in.nextLine().trim();
        System.out.print("Donner la série de la classe : ");
        serie = EdacyProject.in.nextLine().trim();
        System.out.println();
        switch (choix) {
            case 1:
                Classe c1 = new Classe(niveau, serie);
                if (!classes.contains(c1)) {
                    classes.add(c1);
                    System.out.println("La classe a été ajoutéé.");
                } else {
                    System.out.println("Cette classe existe deja.");
                }
                break;
            case 2:
                for (Classe t : classes) {
                    if (t.getNiveau().equals(niveau) && t.getSerie().equals(serie)) {
                        System.out.print("Donner le nouveau niveau de la classe : ");
                        t.setNiveau(EdacyProject.in.nextLine().trim());
                        System.out.print("Donner la nouvelle série de la classe : ");
                        t.setSerie(EdacyProject.in.nextLine().trim());
                        System.out.println("La classe a été modiféé.");
                        test = true;
                    }
                }
                if (!test) {
                    System.out.println("Cette classe n'existe pas");
                }
                break;
            case 3:
                classes.removeIf((c) -> {
                    return c.getNiveau().equals(niveau) && c.getSerie().equals(serie);
                });
                System.out.println("La classe a été suprimée.");
                break;
        }

    }
}
