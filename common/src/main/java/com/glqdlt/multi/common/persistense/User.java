package com.glqdlt.multi.common.persistense;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 4:38
 */
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Data
public class User {


    @GeneratedValue
    @Id
    private int id;


    @NonNull
    private String user_id;
    @NonNull
    private String user_name;
    @NonNull
    private String password;


}
