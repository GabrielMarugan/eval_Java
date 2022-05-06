package edu.mns.dfs.eval.models;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CleCarateristique implements Serializable {

    @Column(name = "propriete_id")
    Integer proprieteId;

    @Column(name = "article_id")
    Integer articleId;
}
