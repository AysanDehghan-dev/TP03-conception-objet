package exo2.q2;
import exo2.q1.*;

import java.util.List;

public class Departement implements AvecDirecteur {
    private String nom;
    private Employe directeur;
    private List<Service> services;

    public Departement(String nom, Employe directeur, List<Service> services) {
        this.nom = nom;
        this.directeur = directeur;
        this.services = services;
    }

    @Override
    public Employe getDirecteur() {
        return directeur;
    }

    public List<Service> getServices() {
        return services;
    }

    public String getNom() {
        return nom;
    }
}
