package com.glqdlt.simpleweb;

import com.glqdlt.multi.common.persistense.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 4:41
 */
@Controller
public class SimpleController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public void root(){

    }


}
