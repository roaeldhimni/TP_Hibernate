/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.entities.Commande;
import ma.projet.entities.LigneCommandeProduit;
import ma.projet.entities.LigneCommandeProduitPK;
import ma.projet.entities.Produit;
import ma.projet.services.CommandeService;
import ma.projet.services.LigneCommandeProduitService;
import ma.projet.services.ProduitService;

/**
 *
 * @author Lachgar
 */
public class TestLigneCommandeProduit {

    public static void main(String[] args) {
        CommandeService cs = new CommandeService();
        ProduitService ps = new ProduitService();
        LigneCommandeProduitService lcps = new LigneCommandeProduitService();
        Commande c = cs.getById(1);
        Produit p = ps.getById(1);
        Produit p2 = ps.getById(2);
        Commande c2 = cs.getById(2);

        LigneCommandeProduitPK lpk = new LigneCommandeProduitPK(p.getId(), c.getId());
        LigneCommandeProduitPK lpk2 = new LigneCommandeProduitPK(p2.getId(), c.getId());
        LigneCommandeProduitPK lpk3 = new LigneCommandeProduitPK(p.getId(), c2.getId());

        
        LigneCommandeProduit lp = new LigneCommandeProduit(lpk, 10);
        LigneCommandeProduit lp2 = new LigneCommandeProduit(lpk2, 20);
        LigneCommandeProduit lp3 = new LigneCommandeProduit(lpk3, 50);

        lcps.create(lp);
        lcps.create(lp2);
        lcps.create(lp3);

       
    }
}
