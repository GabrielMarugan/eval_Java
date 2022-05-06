package edu.mns.dfs.eval.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.dao.EmployeDao;
import edu.mns.dfs.eval.models.Commande;
import edu.mns.dfs.eval.models.Employe;
import edu.mns.dfs.eval.view.ViewCommande;
import edu.mns.dfs.eval.view.ViewDetailEmploye;
import edu.mns.dfs.eval.view.ViewEmploye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeController {

    EmployeDao employeDao;

    @Autowired
    public EmployeController(EmployeDao employeDao){
        this.employeDao = employeDao;
    }

    @GetMapping("/employe/{id}")
    @JsonView(ViewDetailEmploye.class)
    public Employe employe(@PathVariable Integer id){
        return employeDao.findById(id).orElse(null);
    }

    @GetMapping("/liste-employe")
    @JsonView(ViewEmploye.class)
    public List<Employe> listEmploye(){
        return employeDao.findAll();
    }

    @GetMapping("/compte-administrateur")
    public Integer compteAdministrateur(){
        return employeDao.compteAdministrateur();
    }

}
