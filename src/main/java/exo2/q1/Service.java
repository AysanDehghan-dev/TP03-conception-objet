package exo2.q1;

import java.util.List;

public class Service {
    private String nom;
    private List<Equipe> equipes;


    public Service(String nom, List<Equipe> equipes) {
        this.nom = nom;
        this.equipes = equipes;
    }

    public String getNom() {
        return this.nom;
    }

    public List<Equipe> getEquipes() {
        return this.equipes;
    }
    
    public List<Employe> getDirecteursEquipes() {
        List<Employe> directeurs = new java.util.ArrayList<>();
        for (Equipe e : equipes) {
            directeurs.add(e.getDirecteurEquipe());
        }
        return directeurs;
    }


}
