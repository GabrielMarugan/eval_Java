package edu.mns.dfs.eval.models;


import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.eval.view.ViewCommande;
import edu.mns.dfs.eval.view.ViewDetailEmploye;
import edu.mns.dfs.eval.view.ViewEmploye;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ViewEmploye.class)
    private Integer id;

    @JsonView({ViewCommande.class, ViewEmploye.class, ViewDetailEmploye.class})
    public String login;

    public String password;


    @OneToMany(mappedBy = "client")
    private List<Commande> listeCommande = new ArrayList<>();

    @ManyToMany
    private List<MoyenPaiement> listeMoyenPaiement = new ArrayList<>();


}
