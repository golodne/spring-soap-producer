package ru.producer.repository;

import org.springframework.data.repository.CrudRepository;
import ru.producer.entity.Article;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findByArticleId(long articleId);
    List<Article> findByTitleAndCategory(String title, String category);
}
