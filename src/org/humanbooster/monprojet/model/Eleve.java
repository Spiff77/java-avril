package org.humanbooster.monprojet.model;

public class Eleve {

    private String name;
    private Professeur professeur;

    public Eleve(String name) {
        this.name = name;
    }

    public Eleve(String name, Professeur professeur) {
        this(name);
        this.professeur = professeur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Eleve{");
        sb.append("name='").append(name).append('\'');
        sb.append(", professeur=").append(professeur);
        sb.append('}');
        return sb.toString();
    }
}
