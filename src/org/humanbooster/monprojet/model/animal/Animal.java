package org.humanbooster.monprojet.model.animal;

public abstract class Animal {

    private boolean immobile = false;

    public abstract void manger();

    public void cours(){
        immobile = false;
    }
    public void arreter(){
        immobile = true;
    }

}


