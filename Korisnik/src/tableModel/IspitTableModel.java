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
public class IspitTableModel extends AbstractTableModel{

    List<PolozenIspit> listaIspita;

    public IspitTableModel(List<PolozenIspit> listaIspita) {
        this.listaIspita = listaIspita;
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
        PolozenIspit p = listaIspita.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getIspit().getNaziv();
            case 1: return p.getOcena();
            default: return "Greska";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Ispit";
            case 1: return "Ocena";
            default: return "Greska";
        }
    }
}
