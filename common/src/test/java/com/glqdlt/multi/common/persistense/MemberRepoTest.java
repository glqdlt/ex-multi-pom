package com.glqdlt.multi.common.persistense;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

/**
 * Created By iw.jhun
 * On 2018-03-28 , 오후 6:05
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepoTest {

    @Autowired
    TeamRepo teamRepo;

    @Autowired
    MemberRepo memberRepo;

    @Test
//    영속성 관련 에러 때문에 트랜잭션을 달아둔다.
    @Transactional
    public void save(){

        Team team = new Team();
        team.setName("team-1");
        teamRepo.save(team);

        Member member1 = new Member();
        member1.setUsername("member-1");
        member1.setTeam(team);


        Member member2 = new Member();
        member2.setUsername("member-2");
        member2.setTeam(team);

        // team을 생성해놓지 않으면 에러가 난다.

        memberRepo.save(member1);
        memberRepo.save(member2);

        memberRepo.findAll().forEach(x -> log.debug(x.toString()));

    }

}