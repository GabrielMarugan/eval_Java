package edu.mns.dfs.eval.dao;

import edu.mns.dfs.eval.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends JpaRepository< Article, Integer> {
}
