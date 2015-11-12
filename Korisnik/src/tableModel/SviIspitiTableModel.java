/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tableModel;

import domen.Ispit;
import domen.PolozenIspit;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class SviIspitiTableModel  extends AbstractTableModel{
    List<Ispit> listaIspita;

    public SviIspitiTableModel(List<Ispit> listaIspita) {
        this.listaIspita = listaIspita;
    }

    public List<Ispit> getListaIspita() {
        return listaIspita;
    }

    @Override
    public int getRowCount() {
        return listaIspita.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ispit p = listaIspita.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getIspitID();
            case 1: return p.getNaziv();
            default: return "Greska";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Sifra";
            case 1: return "Naziv";
            default: return "Greska";
        }
    }
}
