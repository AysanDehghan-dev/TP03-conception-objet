package exo2.q2;
import exo2.q1.*;

import java.util.List;

public class Equipe implements AvecDirecteur {
    private String nom;
    private Employe directeur;
    private List<Employe> employes;

    public Equipe(String nom, Employe directeur, List<Employe> employes) {
        this.nom = nom;
        this.directeur = directeur;
        this.employes = employes;
    }

    @Override
    public Employe getDirecteur() {
        return directeur;
    }

    public String getNom() {
        return nom;
    }

    public List<Employe> getEmployes() {
        return employes;
    }
}
