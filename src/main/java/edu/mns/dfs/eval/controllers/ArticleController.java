package edu.mns.dfs.eval.controllers;

import edu.mns.dfs.eval.dao.ArticleDao;
import edu.mns.dfs.eval.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ArticleController {

    ArticleDao articleDao;

    @Autowired
    public ArticleController(ArticleDao articleDao){
        this.articleDao = articleDao;
    }


    @PostMapping("/article")
    public String ajouterArticle(@RequestBody Article article){

        articleDao.save(article);
        return "Ajout Ok";
    }

}
