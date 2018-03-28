package com.glqdlt.multi.common.persistense;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 2:43
 */
public interface ArticleRepo extends JpaRepository<Article, Integer> {
}
