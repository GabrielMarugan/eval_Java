package edu.mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.view.ViewCommande;
import edu.mns.dfs.eval.view.ViewDetailEmploye;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @JsonView({ViewCommande.class, ViewDetailEmploye.class})
    private String nom;

    @JsonView(ViewCommande.class)
    private Float prix;

    @ManyToOne
    private Employe gestionnaire;

    @ManyToMany
    private List<Caracteristique> listeCaracteristique;


}
