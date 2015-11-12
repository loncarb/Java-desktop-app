/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class Racun extends DomenskiObjekat{
    private int racunID;
    private Student student;
    private java.sql.Date datum;
    private double ukupanIznos;
    private List<StavkaRacuna> listaStavki;
    private Sluzbenik sluzbenik;

    public Sluzbenik getSluzbenik() {
        return sluzbenik;
    }

    public void setSluzbenik(Sluzbenik sluzbenik) {
        this.sluzbenik = sluzbenik;
    }

    public Racun() {
        listaStavki = new ArrayList<>();
    }

    public int getRacunID() {
        return racunID;
    }

    public void setRacunID(int racunID) {
        this.racunID = racunID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public Date getDatum() {
        return datum;
    }

    public void setDatum(java.sql.Date datum) {
        this.datum = datum;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public List<StavkaRacuna> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(List<StavkaRacuna> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public Racun(int racunID, Student student, java.sql.Date datum, double ukupanIznos, List<StavkaRacuna> listaStavki, Sluzbenik sluzbenik) {
        this.racunID = racunID;
        this.student = student;
        this.datum = datum;
        this.ukupanIznos = ukupanIznos;
        this.listaStavki = listaStavki;
        this.sluzbenik = sluzbenik;
    }

    @Override
    public String vratiNazivTabele() {
        return "Racun";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return "'"+racunID+"','"+student.getJMBG()+"','"+datum+"','"+ukupanIznos+"','"+sluzbenik.getKorisnickoIme()+"'";
    }

    @Override
    public DomenskiObjekat vratiDomenskiObjekat() {
        return null;
    }
    
    
}
