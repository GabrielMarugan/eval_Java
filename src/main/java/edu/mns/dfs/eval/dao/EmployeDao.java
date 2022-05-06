package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository<Employe,Integer> {



    @Query("SELECT COUNT(*) FROM Employe E WHERE E.administrateur = 1")
    Integer compteAdministrateur();
}
