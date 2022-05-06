package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande,Integer> {
}
