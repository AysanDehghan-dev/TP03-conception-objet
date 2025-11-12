package exo2.q2;
import exo2.q1.*;

import java.util.List;

public class Entreprise implements AvecDirecteur {
    private String nom;
    private Employe directeur;
    private List<Departement> departements;

    public Entreprise(String nom, Employe directeur, List<Departement> departements) {
        this.nom = nom;
        this.directeur = directeur;
        this.departements = departements;
    }

    @Override
    public Employe getDirecteur() {
        return directeur;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public String getNom() {
        return nom;
    }
}
