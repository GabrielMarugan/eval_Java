package edu.mns.dfs.eval.controllers;

import edu.mns.dfs.eval.dao.EmployeDao;
import edu.mns.dfs.eval.dao.UtilisateurDao;
import edu.mns.dfs.eval.models.Employe;
import edu.mns.dfs.eval.models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UtilisateurController {

    UtilisateurDao utilisateurDao;
    EmployeDao employeDao;

    @Autowired
    public UtilisateurController(UtilisateurDao utilisateurDao,EmployeDao employeDao){
        this.utilisateurDao = utilisateurDao;
        this.employeDao = employeDao;
    }

    @GetMapping("/compte-utilisateur")
    public Integer compteUtilisateur(){
        return utilisateurDao.compteUtilisateur();
    }

    @DeleteMapping("/utilisateur/{login}")
    public String supprimeUtilisateur(@PathVariable String login){
        String retour ="Echec";

        //recherche de l'utilisateur par le login
        Utilisateur utilisateur = utilisateurDao.findByLogin(login).orElse(null);
        //on a trouver un utilisateur, on va le cherche dans la table Employe
        if (utilisateur != null){
            boolean trouver = false;
            Employe employe = employeDao.findById(utilisateur.getId()).orElse(null);

            if (employe != null) {
                trouver = true;
            }
          //si on trouve pas l'utilisateur dans la table employer, on supprime
           if (!trouver) {
                //utilisateurDao.deleteByLogin(login);
                utilisateurDao.delete(utilisateur);
                retour = "Succes";

            }

        }



        return retour;
    }



}
