package edu.mns.dfs.eval.models;


import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.view.ViewDetailEmploye;
import edu.mns.dfs.eval.view.ViewEmploye;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Employe extends Utilisateur{

    @JsonView(ViewEmploye.class)
    public boolean administrateur;

    @OneToMany(mappedBy = "gestionnaire")
    @JsonView(ViewDetailEmploye.class)
    private List<Article> listeArticleAgerer = new ArrayList<>();
}
