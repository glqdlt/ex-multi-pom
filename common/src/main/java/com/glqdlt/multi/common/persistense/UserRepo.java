package com.glqdlt.multi.common.persistense;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 4:39
 */
public interface UserRepo extends JpaRepository<UserEntity,Integer> {
}
