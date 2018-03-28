package com.glqdlt.multi.common.persistense;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 3:01
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleRepoTest {

    @Autowired
    ArticleRepo articleRepo;

    @Test
    public void insert(){

        Article article = new Article();
        article.setContent("contents~~");
        article.setTitle("titles~~");
        article.setWriter(1);

        articleRepo.save(article);

        articleRepo.findAll().forEach(x -> log.debug(x.toString()));


    }

}