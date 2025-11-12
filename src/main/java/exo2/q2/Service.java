package exo2.q2;
import exo2.q1.*;

import java.util.List;

public class Service implements AvecDirecteur {
    private String nom;
    private Employe directeur;
    private List<Equipe> equipes;

    public Service(String nom, Employe directeur, List<Equipe> equipes) {
        this.nom = nom;
        this.directeur = directeur;
        this.equipes = equipes;
    }

    @Override
    public Employe getDirecteur() {
        return directeur;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public String getNom() {
        return nom;
    }
}
