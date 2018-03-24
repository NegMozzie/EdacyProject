/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edacyproject.Classe;


/**
 *
 * @author sarrm
 */
public class Classe {
    private String niveau;
    private String serie;

    public Classe(String niveau, String serie) {
        this.niveau = niveau;
        this.serie = serie;
    }
    

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }    

    @Override
    public String toString() {
        return niveau + " " + serie;
    }

    @Override
    public boolean equals(Object obj) {
        Classe c = (Classe)obj;
        
        return c.getNiveau().equalsIgnoreCase(this.niveau) 
                && c.getSerie().equalsIgnoreCase(serie);
    }
}
