/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import transfer.TObjekat;

/**
 *
 * @author user
 */
public class Komunikacija {
    private Socket soket;
    private static Komunikacija instance;
    private HashMap<String, Object> hashMapa;
    private int brojRacuna;

    public HashMap<String, Object> getHashMapa() {
        return hashMapa;
    }

    public void setHashMapa(HashMap<String, Object> hashMapa) {
        this.hashMapa = hashMapa;
    }
    
    public Komunikacija () throws IOException {
        soket = new Socket("127.0.0.1", 9000);
        System.out.println("Klijent se povezao sa serverom");
        hashMapa = new HashMap<>();
        brojRacuna=0;
    }
    
    public static Komunikacija vratiObjekat () throws IOException {
        if (instance == null) {
            instance = new Komunikacija();
        }
        return instance;
    }
    
    public void posalji (TObjekat objekat) throws IOException {
        ObjectOutputStream outSocket = new ObjectOutputStream(soket.getOutputStream());
        outSocket.writeObject(objekat);
    }
    
    public TObjekat procitaj () throws IOException, ClassNotFoundException {
        ObjectInputStream inSocket = new ObjectInputStream(soket.getInputStream());
        TObjekat objekat = (TObjekat) inSocket.readObject();
        return objekat;
    }
    
    public int brojRacuna(){
        brojRacuna=brojRacuna+1;
        return brojRacuna;
    }
}
