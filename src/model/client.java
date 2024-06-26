package model;
import java.sql.*;

public class client extends utilisateur {

    private int categorie_abonnement;
    private Date date_inscription;
    private boolean particulier;

    public client(){}
    public client(int i, String n, String p, String m, String pswd, int c, Date d, boolean p2){
        super(i, n, p, m, pswd);
        this.categorie_abonnement = c;
        this.date_inscription = d;
        this.particulier = p2;
    }

    public int getCategorie_abonnement() {
        return categorie_abonnement;
    }
    public void setCategorie_abonnement(int categorie_abonnement) {
        this.categorie_abonnement = categorie_abonnement;
    }
    public Date getDate_inscription() {
        return date_inscription;
    }
    public void setDate_inscription(Date date_inscription) {
        this.date_inscription = date_inscription;
    }
    public boolean isParticulier() {
        return particulier;
    }
    public void setParticulier(boolean particulier) {
        this.particulier = particulier;
    }
    public void setAttribut2(int i, String n, String p, String m, String pa, int c, Date d, boolean p3){
        setAttribut1(i, n, p, m, pa);
        categorie_abonnement = c;
        date_inscription = d;
        particulier = p3;
    }

    public void afficherAttributs() {
        super.afficherAttributs();
        System.out.println("5. Catégorie abonnement : " + categorie_abonnement);
        System.out.println("6. Date inscription : " + date_inscription);
        System.out.println("7. Particulier : " + particulier);
        System.out.println("\n");
    }
}
