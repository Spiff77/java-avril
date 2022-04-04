package org.humanbooster.monprojet.model;

import java.util.ArrayList;

public class Professeur {

    private String name;
    private ArrayList eleves = new ArrayList();

    public Professeur(String name) {
        this.name = name;
    }

    public void add(Eleve e){
        this.eleves.add(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getEleves() {
        return eleves;
    }

    public void setEleves(ArrayList eleves) {
        this.eleves = eleves;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professeur{");
        sb.append("name='").append(name).append('\'');
        sb.append(", eleves size=").append(eleves.size());
        sb.append('}');
        return sb.toString();
    }
}
