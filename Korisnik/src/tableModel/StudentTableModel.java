/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tableModel;

import domen.Student;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class StudentTableModel extends AbstractTableModel{
    List<Student> listaStudenata;

    public void setListaStudenata(List<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public List<Student> getListaStudenata() {
        return listaStudenata;
    }

    public StudentTableModel(List<Student> lista) {
        listaStudenata = lista;
    }
    
    @Override
    public int getRowCount() {
        return listaStudenata.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = listaStudenata.get(rowIndex);
        switch (columnIndex) {
            case 0: return s.getJMBG();
            case 1: return s.getIme();
            case 2: return s.getPrezime();
            case 3: return s.getBrIndeksa();
            case 4: return s.getAdresa().getUlica()+" "+s.getAdresa().getBroj();
            case 5: return s.getAdresa().getMesto();
            default: return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "JMBG";
            case 1: return "Ime";
            case 2: return "Prezime";
            case 3: return "Broj indeksa";
            case 4: return "Adresa";
            case 5: return "Mesto";
            default: return "Greska";
        }
    }
    
    public void dodajStudenta (Student s){
        listaStudenata.add(s);
        fireTableDataChanged();
    }
    
    public void dodajListu (List<Student> listaStudenata){
        for(Student s: listaStudenata){
            dodajStudenta(s);
        }
    }
    
    public void obrisiStudenta (int a) {
        listaStudenata.remove(a);
        fireTableDataChanged();
    }
}
