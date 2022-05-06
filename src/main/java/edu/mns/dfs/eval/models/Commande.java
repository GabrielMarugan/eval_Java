package edu.mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.view.ViewCommande;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonView(ViewCommande.class)
    private Date datePaiement;


    @ManyToOne
    @JsonView(ViewCommande.class)
    private Utilisateur client;

    @OneToMany(mappedBy = "commande")
    @JsonView(ViewCommande.class)
    private List<LigneCommande> listeLigneCommande = new ArrayList<>();


}
