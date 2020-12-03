package com.company;

public class Client extends Pharmacien {

    private int someVente;

    public Client(int id, String firstname, String lastname, int phone, String email, int someVente) {
        super(id, firstname, lastname, phone, email);
        this.someVente = someVente;
    }

    public int getSomeVente() {
        return someVente;
    }

    public void setSomeVente(int someVente) {
        this.someVente = someVente;
    }
}
