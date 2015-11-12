/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

/**
 *
 * @author user
 */
public class StavkaRacuna extends DomenskiObjekat{
    private Racun racun;
    private long stavkaRacunaID;
    private Proizvod proizvod;
    private double cena;
    private double kolicina;
    private double iznosNaStavci;

    public StavkaRacuna() {
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public long getStavkaRacunaID() {
        return stavkaRacunaID;
    }

    public void setStavkaRacunaID(long stavkaRacunaID) {
        this.stavkaRacunaID = stavkaRacunaID;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double getIznosNaStavci() {
        return iznosNaStavci;
    }

    public void setIznosNaStavci(double iznosNaStavci) {
        this.iznosNaStavci = iznosNaStavci;
    }

    @Override
    public String vratiNazivTabele() {
        return "StavkaRacuna";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return "'"+stavkaRacunaID+"','"+racun.getRacunID()+"','"+proizvod.getNaziv()+"','"+cena+"','"+kolicina+"','"+iznosNaStavci+"'";
    }

    @Override
    public DomenskiObjekat vratiDomenskiObjekat() {
        return null;
    }
    
    
}
