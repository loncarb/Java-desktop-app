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
public class PolozenIspit extends DomenskiObjekat implements Serializable{
    Ispit ispit;
    Student student;
    int ocena;
    boolean prijavljen;
    Sluzbenik sluzbenik;

    public Ispit getIspit() {
        return ispit;
    }

    public void setIspit(Ispit ispit) {
        this.ispit = ispit;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean isPrijavljen() {
        return prijavljen;
    }

    public void setPrijavljen(boolean prijavljen) {
        this.prijavljen = prijavljen;
    }

    public Sluzbenik getSluzbenik() {
        return sluzbenik;
    }

    public void setSluzbenik(Sluzbenik sluzbenik) {
        this.sluzbenik = sluzbenik;
    }

    public PolozenIspit() {
    }

    public PolozenIspit(Ispit ispit, Student student, int ocena, boolean prijavljen, Sluzbenik sluzbenik) {
        this.ispit = ispit;
        this.student = student;
        this.ocena = ocena;
        this.prijavljen = prijavljen;
        this.sluzbenik = sluzbenik;
    }

    @Override
    public DomenskiObjekat vratiDomenskiObjekat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String vratiNazivTabele() {
        return "PolozenIspit";
    }
    
    @Override
    public String vratiVrednostiZaInsert() {
        
        return ""+ispit.getIspitID()+", "+student.getJMBG()+",'"+sluzbenik.getKorisnickoIme()+"',"+ocena+","+prijavljen+"";
    }
    
    @Override
    public String vratiNazivTabeleZaJoin() {
        return "Ispit INNER JOIN PolozenIspit ON Ispit.IspitID = PolozenIspit.Ispit WHERE PolozenIspit.Ocena > 5 AND PolozenIspit.Student=" + student.getJMBG();
    }
}
