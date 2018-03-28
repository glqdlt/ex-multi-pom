package com.glqdlt.multi.common.persistense;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void save(){

        Team team = new Team();
        team.setName("team-1");


        Member member1 = new Member();
        member1.setUsername("member-1");
        member1.setTeam(team);


        Member member2 = new Member();
        member2.setUsername("member-2");
        member2.setTeam(team);

        // team을 생성해놓지 않으면 에러가 난다.
        teamRepo.save(team);

        memberRepo.save(member1);
        memberRepo.save(member2);

        memberRepo.findAll().forEach(x -> log.debug(x.toString()));
    }

}