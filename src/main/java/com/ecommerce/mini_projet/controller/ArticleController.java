package com.ecommerce.mini_projet.controller;

import com.ecommerce.mini_projet.Repository.ArticleRepository;
import com.ecommerce.mini_projet.Repository.ContenirRepository;
import com.ecommerce.mini_projet.model.Article;
import com.ecommerce.mini_projet.model.Contenir;
import com.ecommerce.mini_projet.service.ArticleService;
import com.ecommerce.mini_projet.service.ClientService;
import com.ecommerce.mini_projet.service.ContenirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin (origins = "*")
@RestController
@RequestMapping("/api")
public class ArticleController {
    private final ArticleService articleService;
    @Autowired
    public ArticleController(ArticleService articleService){
        this.articleService=articleService;
    }
    @GetMapping("/articles")
    public List<Article> getArticle(){
        return articleService.getArticle();
    }
    @GetMapping("/articles/{id}")
    public Article getArticleById(@PathVariable Long id){
        return articleService.getArticleById(id);
    }
    @PostMapping("/articles")
    public Article addArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }
    @PutMapping("/articles/{id}")
    public Article updateArticle(@PathVariable Long id,@RequestBody Contenir updateArticle){
        return articleService.updateArticle(id,updateArticle);
    }
    @DeleteMapping("/articles/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Long id){
        articleService.deleteArticle(id);
        return ResponseEntity.noContent().build();
    }
}
