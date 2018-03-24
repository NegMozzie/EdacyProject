/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edacyproject.Classe;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author sarrm
 */
public class Etudiant {
    protected String nom;
    protected String prenom;
    private Classe classe;

    public Etudiant(String nom, String prenom, Classe classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " " + classe;
    }   
}
