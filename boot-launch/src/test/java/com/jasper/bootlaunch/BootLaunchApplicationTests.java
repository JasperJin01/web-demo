package com.jasper.bootlaunch;

import com.jasper.bootlaunch.controller.ArticleController;
import com.jasper.bootlaunch.model.Article;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


// ����û��ʹ��@RunWith(SpringRunner.class)������Ҳ����������
// Test�������jupyter�ģ������ֱ������Springboot����������ҪRunWith�������junit.test������ҪRunWith
// ���������������BootLaunchApplicationTests���Ǿ���BootLaunchApplication������ࡣ
// FIXME SpringBootTests(classes = { BootLaunchApplication.class } ) Ϊʲô���ԣ�
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
