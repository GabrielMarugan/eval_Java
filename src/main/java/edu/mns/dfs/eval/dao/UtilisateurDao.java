package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.Utilisateur;
import jdk.jshell.execution.Util;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

    @Query("SELECT COUNT(*) FROM Utilisateur U")
    Integer compteUtilisateur();

    //ne semble pas marcher
    //void deleteByLogin(String login);

    Optional<Utilisateur> findByLogin(String login);
}
