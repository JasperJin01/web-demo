package com.jasper.bootlaunch;

import com.jasper.bootlaunch.controller.ArticleController;
import com.jasper.bootlaunch.model.Article;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


// 这里没有使用@RunWith(SpringRunner.class)，但是也运行起来了
// Test类如果是jupyter的，则可以直接启动Springboot环境，不需要RunWith。如果是junit.test，就需要RunWith
// 这个测试类名称是BootLaunchApplicationTests，那就是BootLaunchApplication是入口类。
// FIXME SpringBootTests(classes = { BootLaunchApplication.class } ) 为什么不对？
@SpringBootTest
class BootLaunchApplicationTests {

    @Resource
    ArticleController articleController;

    @Test
    void testSelect() {
        List<Article> articles = (List<Article>)articleController.getArticle().getData();
//        Assert.assertEquals(4, articles.size());
        articles.forEach(System.out::println);

    }

}
