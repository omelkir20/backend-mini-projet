package com.ecommerce.mini_projet.service;

import com.ecommerce.mini_projet.Repository.ArticleRepository;
import com.ecommerce.mini_projet.model.Article;
import com.ecommerce.mini_projet.model.Client;
import com.ecommerce.mini_projet.model.Contenir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }
    public List<Article> getArticle(){

        return articleRepository.findAll();

    }
    public Article addArticle(Article article){
        return articleRepository.save(article);
    }
    public Article getArticleById(Long id){
        return articleRepository.findById(id).orElse(null);
    }
    public void deleteArticle(Long id){
        articleRepository.deleteById(id);
    }

    public Article updateArticle(Long id, Contenir updateArticle)
    { Article existingArticle=getArticleById(id);
        return articleRepository.save(existingArticle);
    }


}
