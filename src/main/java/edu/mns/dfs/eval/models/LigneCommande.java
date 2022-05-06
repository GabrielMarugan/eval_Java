package edu.mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.view.ViewCommande;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonView(ViewCommande.class)
    private Integer quantite;

    @ManyToOne
    @JsonView(ViewCommande.class)
    private Article article;

    @ManyToOne
    private Commande commande;
}
