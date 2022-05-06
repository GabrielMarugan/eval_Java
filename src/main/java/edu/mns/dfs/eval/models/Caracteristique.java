package edu.mns.dfs.eval.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(CleCarateristique.class)
@Getter
@Setter
public class Caracteristique {

    @Id
    private Integer articleId;
    @Id
    private Integer proprieteId;

    private String valeur;

    @ManyToOne
    @MapsId("artcile_id")
    private Article article;

    @ManyToOne
    @MapsId("propriete_id")
    private Propriete propriete;
}
