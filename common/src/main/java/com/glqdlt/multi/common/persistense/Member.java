package com.glqdlt.multi.common.persistense;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 6:01
 */
@Data
@ToString
@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name="member_id")
    private int id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
