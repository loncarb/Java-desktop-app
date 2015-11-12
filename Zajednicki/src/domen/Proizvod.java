/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Proizvod extends DomenskiObjekat implements Serializable{
    private long sifraProizvoda;
    private String naziv;
    private double cena;

    public Proizvod() {
    }

    public Proizvod(long sifraProizvoda, String naziv, double cena) {
        this.sifraProizvoda = sifraProizvoda;
        this.naziv = naziv;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public long getSifraProizvoda() {
        return sifraProizvoda;
    }

    public void setSifraProizvoda(long sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public DomenskiObjekat vratiDomenskiObjekat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String vratiNazivTabele() {
        return "Proizvod";
    }

    @Override
    public String vratiNazivTabeleZaJoin() {
        return vratiNazivTabele();
    }
    
    @Override
    public String vratiVrednostiZaInsert() {
        return super.vratiVrednostiZaInsert(); //To change body of generated methods, choose Tools | Templates.
    }
}
