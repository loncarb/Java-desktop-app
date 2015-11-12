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
public class Ispit extends DomenskiObjekat implements Serializable{
    int ispitID;
    String naziv;

    public int getIspitID() {
        return ispitID;
    }

    public void setIspitID(int ispitID) {
        this.ispitID = ispitID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    @Override
    public DomenskiObjekat vratiDomenskiObjekat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiNazivTabele() {
        return "Ispit";
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
