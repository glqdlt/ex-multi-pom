package com.glqdlt.multi.common.persistense;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 6:04
 */
public interface MemberRepo extends JpaRepository<Member,Integer> {
}
