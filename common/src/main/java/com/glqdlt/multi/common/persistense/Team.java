package com.glqdlt.multi.common.persistense;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 6:02
 */
@ToString
@Data
@Entity
public class Team {

    @Id
    @GeneratedValue
    @Column(name="team_id")
    private int id;

    private String name;

}
