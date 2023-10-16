/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author HP
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reference;
    private float prix;
    
    @ManyToOne
    private Categorie categorie;
    
    
    // mappedby dans la classe qui est contenu c a d produit dedans de commande
    //mappedby permet de specifier les tables qui vont etre associees
    @ManyToMany(mappedBy = "produits")
    private List<Commande> commandes ;
    
   

    public Produit() {
    }

    public Produit(String reference, float prix, Categorie categorie) {
        this.reference = reference;
        this.prix = prix;
        this.categorie = categorie;
    }


    
   

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", reference=" + reference + ", prix=" + prix + ", categorie=" + categorie + '}';
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the prix
     */
    public float getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }

    /**
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    
    
}
