package com.glqdlt.multi.common.persistense;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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


    @Before
    public void initData(){
        userRepo.save(new UserEntity("test-id","test-man","12345"));
    }

    @Test
    public void selectUsers(){
        Assert.assertEquals(1,userRepo.findAll().size());
    }
}
