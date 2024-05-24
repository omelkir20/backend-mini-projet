package com.ecommerce.mini_projet.Repository;

import com.ecommerce.mini_projet.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
