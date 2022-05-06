package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.Caracteristique;
import edu.mns.dfs.eval.models.CleCarateristique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristiqueDao extends JpaRepository <Caracteristique, CleCarateristique> {
}
