package controller;
import view.view;
import model.*;
import java.sql.*;
import java.util.*;

public class controller {
    private listeVehicule lv = null;
    private listeLocation ll = null;
    private client cl = null;
    public DAOvehicule vehiculeAccess = null;
    public DAOutilisateur utilisateurAccess = null;
    public DAOlocation locationAccess = null;
    public DAOclient clientAccess = null;

    public controller(){
        this.lv = new listeVehicule(null, null, 0, null, 0, null, 0);
        this.ll = new listeLocation();
        this.vehiculeAccess = new DAOvehicule();
        this.utilisateurAccess = new DAOutilisateur();
        this.locationAccess = new DAOlocation();
        this.clientAccess = new DAOclient();
        this.cl = new client();
    }

    public DAOvehicule getVehiculeAccess(){ return vehiculeAccess; }
    public DAOutilisateur getUtilisateurAccess(){ return utilisateurAccess; }
    public DAOlocation getLocationAccess(){ return locationAccess; }
    public DAOclient getClientAccess(){ return clientAccess; }

    public listeVehicule getLv(){
        return lv;
    }

    public listeLocation getLl(){
        return ll;
    }

    public client getClient(){
        return cl;
    }

    public void run(){
        view.accueil();
    }


}