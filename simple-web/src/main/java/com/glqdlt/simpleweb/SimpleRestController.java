package com.glqdlt.simpleweb;

import com.glqdlt.multi.common.persistense.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By iw.jhun
 * On 2018-03-27 , 오후 4:41
 */
@RestController
public class SimpleRestController {

    @RequestMapping(value = "/echo",method = RequestMethod.GET)
    public ResponseEntity<String> echo(){

        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }


}
