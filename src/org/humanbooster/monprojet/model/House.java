package org.humanbooster.monprojet.model;

public class House {

    private int id = 1;
    private int nbrePortes = 12;
    private String address = "DF";
    private CleanDay cleaningDay;


    public House(String address, CleanDay cleaningDay) {
        this.address = address;
        this.cleaningDay = cleaningDay;
    }

    public int getId() {
        return id;
    }

    public void afficheAdresse(){
        System.out.println("Adresse: " + this.address);
    }

    public int getNbrePortes() {
        return nbrePortes;
    }

    public String getAddress() { return address; }

}
