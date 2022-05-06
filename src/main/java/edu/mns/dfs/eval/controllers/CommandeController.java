package edu.mns.dfs.eval.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.dao.CommandeDao;
import edu.mns.dfs.eval.models.Commande;
import edu.mns.dfs.eval.view.ViewCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CommandeController {

    CommandeDao commandeDao;

    @Autowired
    public CommandeController(CommandeDao commandeDao){
        this.commandeDao = commandeDao;
    }

    @GetMapping("/liste-commande")
    @JsonView(ViewCommande.class)
    public List<Commande> commandes(){
        return commandeDao.findAll();
    }


}


