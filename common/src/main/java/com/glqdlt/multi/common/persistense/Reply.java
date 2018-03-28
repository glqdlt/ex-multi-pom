package com.glqdlt.multi.common.persistense;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 2:39
 */


@Table(name="reply")
@ToString
@Data
@Entity
public class Reply {


    @Column(name="reply_id")
    @GeneratedValue
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;

    private String content;

}
