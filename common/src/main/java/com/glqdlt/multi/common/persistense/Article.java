package com.glqdlt.multi.common.persistense;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 2:37
 */
@Table(name="article")
@ToString
@Data
@Entity
public class Article {

    @GeneratedValue
    @Column(name = "article_id")
    @Id
    private int id;

    private int writer;

    private String title;
    private String content;


    @OneToMany(mappedBy = "article")
    private List<Reply> reply = new ArrayList<>();
}
