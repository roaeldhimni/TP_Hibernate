/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.Date;
import java.util.List;
import ma.project.entities.Categorie;
import ma.project.entities.Commande;
import ma.project.entities.LigneCommandeProduit;
import ma.project.entities.Produit;
import ma.project.service.CategorieService;
import ma.project.service.CommandeService;
import ma.project.service.LigneCommandeProduitService;
import ma.project.service.ProduitService;
import ma.project.util.HibernateUtil;

/**
 *
 * @author HP
 */
public class Test {

    public static void main(String[] args) {
        ProduitService ps = new ProduitService();
        CategorieService cs = new CategorieService();
        CommandeService cms = new CommandeService();
        LigneCommandeProduitService ls = new LigneCommandeProduitService();
        
//        Produit p0 = ps.getById(10);
//        Produit p1 = ps.getById(11);
//        Produit p2 = ps.getById(12);
//        Produit p3 = ps.getById(13);
//        Produit p4 = ps.getById(14);
        
       
        cms.getproduitCommandes(2);
//        
//        LigneCommandeProduit l1 = new LigneCommandeProduit(3);
//        LigneCommandeProduit l2 = new LigneCommandeProduit(7);
//        LigneCommandeProduit l3 = new LigneCommandeProduit(9);
//        
//        l1.setProduit(p1);
//        l1.setCommande(c);
//        l2.setProduit(p2);
//        l2.setCommande(c);
//        l3.setProduit(p3);
//        l3.setCommande(c);
//        
//        ls.create(l1);
//        ls.create(l2);
//        ls.create(l3);
//        
       
     
        
//        Categorie c1 = cs.getById(2);
//        List<Produit> produits = ps.getProduitsByCategorie(c1);
//        System.out.print(produits);
        

        
    }

}
