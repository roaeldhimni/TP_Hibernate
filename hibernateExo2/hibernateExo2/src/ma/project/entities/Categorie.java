/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author HP
 */
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String libelle;
    
    @OneToMany(mappedBy = "categorie",fetch = FetchType.EAGER)    //categorie specifie la relation entre les entites c est comment categorie a ete appelle dans produit.java
    private List<Produit> produit;

    public Categorie() {
    }

    public Categorie(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", code=" + code + ", libelle=" + libelle + '}';
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the produit
     */
    public List<Produit> getProduit() {
        return produit;
    }

    /**
     * @param produit the produit to set
     */
    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
    
    
    
}
