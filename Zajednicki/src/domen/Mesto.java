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
public class Mesto extends DomenskiObjekat implements Serializable{
    private String naziv;
    private long postanskiBr;

    public Mesto(String naziv, long postanskiBr) {
        this.naziv = naziv;
        this.postanskiBr = postanskiBr;
    }

    public Mesto() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public long getPostanskiBr() {
        return postanskiBr;
    }

    public void setPostanskiBr(long postanskiBr) {
        this.postanskiBr = postanskiBr;
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
        return "Mesto";
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
