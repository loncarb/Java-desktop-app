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
public class Adresa implements Serializable{
    private String ulica;
    private String broj;
    private Mesto mesto;

    public Adresa(String ulica, String broj, Mesto mesto) {
        this.ulica = ulica;
        this.broj = broj;
        this.mesto = mesto;
    }

    public Adresa() {
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
    
    
}
