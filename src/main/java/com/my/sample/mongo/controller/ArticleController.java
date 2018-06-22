package com.my.sample.mongo.controller;

import com.my.sample.mongo.dao.repository.ArticleRepository;
import com.my.sample.mongo.entity.document.Article;
import com.my.sample.mongo.entity.document.Auth;
import com.my.sample.mongo.entity.document.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Resource
    private ArticleRepository articleRepository;

}
