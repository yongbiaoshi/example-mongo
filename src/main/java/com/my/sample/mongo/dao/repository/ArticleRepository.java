package com.my.sample.mongo.dao.repository;

import com.my.sample.mongo.entity.document.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {

    Article findOneBySn(String sn);
}
