package com.jasper.bootlaunch.controller;

import com.jasper.bootlaunch.AjaxResponse;
import com.jasper.bootlaunch.model.Article;
import com.jasper.bootlaunch.service.ArticleService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {

    @Resource
    ArticleService articleService;

    //获取一篇Article，使用GET方法,根据id查询一篇文章
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {

        Article article = articleService.getArticle(id);

        log.info("article:" + article);

        return AjaxResponse.success(article);
    }


    //增加一篇Article ，使用POST方法(RequestBody方式接收参数)
    //@RequestMapping(value = "/articles",method = RequestMethod.POST)
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article,
                                    @RequestHeader String aaa) {

        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        log.info("saveArticle:" + article);

        articleService.saveArticle(article);

        return AjaxResponse.success();
    }

    //增加一篇Article ，使用POST方法(RequestParam方式接收参数)
  /*@PostMapping("/articles")
  public AjaxResponse saveArticle(@RequestParam  String author,
                                  @RequestParam  String title,
                                  @RequestParam  String content,
                                  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                  @RequestParam  Date createTime) {

    log.info("saveArticle:" + createTime);
    return AjaxResponse.success();
  }*/


    //更新一篇Article，使用PUT方法，以id为主键进行更新
    //@RequestMapping(value = "/articles",method = RequestMethod.PUT)
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        log.info("updateArticle:" + article);
        return AjaxResponse.success();
    }

    //删除一篇Article，使用DELETE方法，参数是id
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }

    @GetMapping("/articles")
    public AjaxResponse getArticle() {
        List<Article> articles = articleService.getAll();
        log.info("articles:" + articles);
        return AjaxResponse.success(articles);

    }
}
