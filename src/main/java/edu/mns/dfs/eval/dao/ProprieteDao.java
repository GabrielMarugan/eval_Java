package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.Propriete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprieteDao extends JpaRepository<Propriete,Integer> {
}
