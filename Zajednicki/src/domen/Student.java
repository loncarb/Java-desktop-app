/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Student extends DomenskiObjekat{
    private String ime;
    private String prezime;
    private String brIndeksa;
    private int JMBG;
    private Adresa adresa;
    List<Ispit> listaPolozenihIspita;
    List<Ispit> listaPrijavljenihIspita;

    public Student(String ime, String prezime, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
    }

    public Student(int JMBG) {
        this.JMBG = JMBG;
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Student(String ime, String prezime, int JMBG, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.adresa = adresa;
    }

    public List<Ispit> getListaPrijavljenihIspita() {
        return listaPrijavljenihIspita;
    }

    public void setListaPrijavljenihIspita(List<Ispit> listaPrijavljenihIspita) {
        this.listaPrijavljenihIspita = listaPrijavljenihIspita;
    }
    
    public Student() {  
    }

    public Student(String ime, String prezime, String brIndeksa, int JMBG, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brIndeksa = brIndeksa;
        this.JMBG = JMBG;
        this.adresa = adresa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getJMBG() {
        return JMBG;
    }

    public void setJMBG(int JMBG) {
        this.JMBG = JMBG;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        int a = s.getJMBG();
        if (JMBG==a){
            return true;
        }else{
            return false;
        }

    }

    public List<Ispit> getListaPolozenihIspita() {
        return listaPolozenihIspita;
    }

    public void setListaPolozenihIspita(List<Ispit> listaPolozenihIspita) {
        this.listaPolozenihIspita = listaPolozenihIspita;
    }

    public Student(String ime, String prezime, String brIndeksa, int JMBG, Adresa adresa, List<Ispit> listaPolozenihIspita) {
        this.ime = ime;
        this.prezime = prezime;
        this.brIndeksa = brIndeksa;
        this.JMBG = JMBG;
        this.adresa = adresa;
        this.listaPolozenihIspita = listaPolozenihIspita;
    }

    public Student(String ime, String prezime, String brIndeksa, int JMBG, Adresa adresa, List<Ispit> listaPolozenihIspita, List<Ispit> listaPrijavljenih) {
        this.ime = ime;
        this.prezime = prezime;
        this.brIndeksa = brIndeksa;
        this.JMBG = JMBG;
        this.adresa = adresa;
        this.listaPolozenihIspita = listaPolozenihIspita;
        listaPolozenihIspita = listaPrijavljenih;
    }

    @Override
    public String vratiNazivTabele() {
        return "Student";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return "'"+JMBG+"','"+ime+"','"+prezime+"','"+brIndeksa+"','"+adresa.getUlica()+"','"+adresa.getBroj()+"','"+adresa.getMesto().getPostanskiBr()+"'";
    }

    @Override
    public DomenskiObjekat vratiDomenskiObjekat() {
        return null;
    }

    @Override
    public String vratiNazivTabeleZaJoin() {
        return "Mesto INNER JOIN Student ON Mesto.PostanskiBroj = Student.Mesto";
    }
    
    
}
