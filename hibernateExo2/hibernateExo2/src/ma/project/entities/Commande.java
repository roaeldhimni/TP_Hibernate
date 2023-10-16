/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author HP
 */
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    
    //jointable dans le proprietaire et permet de specifier les notations
    @ManyToMany
    @JoinTable(
     name = "LigneCommandeProduit",
        joinColumns = @JoinColumn(name = "commande_id"),
        inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits;
    
    @OneToMany(mappedBy = "commande")
    private List<LigneCommandeProduit> lignesCommandeProduits;

    public Commande() {
    }

    public Commande(Date date) {
        this.date = date;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the produits
     */
    public List<Produit> getProduits() {
        return produits;
    }

    /**
     * @param produits the produits to set
     */
    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<LigneCommandeProduit> getLignesCommandeProduits() {
        return lignesCommandeProduits;
    }

    public void setLignesCommandeProduits(List<LigneCommandeProduit> lignesCommandeProduits) {
        this.lignesCommandeProduits = lignesCommandeProduits;
    }
    
    
    
    
    
    
    
}
