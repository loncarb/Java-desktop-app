/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tableModel;

import domen.Racun;
import domen.StavkaRacuna;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author user
 */
public class RacunTableModel extends AbstractTableModel {

    Racun racun;

    public RacunTableModel() {
        racun = new Racun();
    }

    public RacunTableModel(Racun racun) {
        this.racun = racun;
    }

    @Override
    public int getRowCount() {
        return racun.getListaStavki().size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaRacuna sr = racun.getListaStavki().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sr.getStavkaRacunaID();
            case 1:
                return sr.getProizvod();
            case 2:
                return sr.getKolicina();
            case 3:
                return sr.getCena();
            case 4:
                return sr.getIznosNaStavci();
            default:
                return "greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "RB";
            case 1:
                return "Proizvod";
            case 2:
                return "Kolicina";
            case 3:
                return "Cena";
            case 4:
                return "Iznos";
            default:
                return "greska";
        }
    }

    
}
