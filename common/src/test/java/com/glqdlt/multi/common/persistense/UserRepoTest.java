package com.glqdlt.multi.common.persistense;

import lombok.extern.slf4j.Slf4j;
import org.h2.result.ResultTarget;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.parser.Entity;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 4:52
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class UserRepoTest {

    @Autowired
    UserRepo userRepo;



    // 위의 @Before은 모든 메서드가 실행되기 전에 AOP처럼 메소드 단위로 실행된다. 이래서 각 메소드에서 중복으로 데이터 삽입이일어난다.
    // 이 경우 @BeforeClass로 해주어야한다.
    // @BeforeClass는 static만 된다.. static은 객체가 생성 되기 전에 클래스로더에 올라오기 때문에 .. autowired를 활용못한다.

    @Before
    public void initData() {
    }

    @Test
    public void saveEntity() {
        String userId = "test-id";
        UserEntity result = userRepo.save(new UserEntity(userId, "test-man", "12345"));
        Assert.assertEquals(userId, result.getUser_id());
    }

    @Test
    public void selectAll(){
        userRepo.findAll().forEach(x-> log.info(x.getUser_id()));
    }

}
