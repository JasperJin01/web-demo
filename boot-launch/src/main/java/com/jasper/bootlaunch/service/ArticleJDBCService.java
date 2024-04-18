package com.jasper.bootlaunch.service;


import com.jasper.bootlaunch.dao.ArticleJDBCDAO;
import com.jasper.bootlaunch.model.Article;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service   //服务层依赖注入注解
public class ArticleJDBCService implements ArticleService{

    @Resource
    private
    ArticleJDBCDAO articleJDBCDAO;

    @Transactional
    public void saveArticle( Article article) {
        articleJDBCDAO.save(article);
        //int a = 2/0；  //人为制造一个异常，用于测试事务
    }

    public void deleteArticle(Long id){
        articleJDBCDAO.deleteById(id);
    }

    public void updateArticle(Article article){
        articleJDBCDAO.updateById(article);
    }

    public Article getArticle(Long id){
        return articleJDBCDAO.findById(id);
    }

    public List<Article> getAll(){
        return articleJDBCDAO.findAll();
    }

}
