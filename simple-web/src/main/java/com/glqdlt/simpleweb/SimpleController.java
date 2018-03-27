package com.glqdlt.simpleweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 5:19
 */
@Controller
public class SimpleController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String root(){
        return "index";
    }
}
