package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeDao extends JpaRepository <LigneCommande,Integer> {
}
