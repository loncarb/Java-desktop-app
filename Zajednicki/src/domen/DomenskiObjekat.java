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
public abstract class DomenskiObjekat implements Serializable{

    public String vratiNazivTabele(){
        return "";
    }

    public String vratiVrednostiZaInsert() {
    return "";
    }
    
    public abstract DomenskiObjekat vratiDomenskiObjekat ();
    
            
    public String vratiNazivTabeleZaJoin(){
        return "";
    }
}
