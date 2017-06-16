package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by liuyijie on 2017/6/15.
 */
@RestController
public class TestRestController {

    /**
     */
    @RequestMapping(value = "rest",  method = RequestMethod.GET)
    public HashMap<String, Object> contact(HttpServletRequest request, HttpServletResponse response){
        HashMap<String, Object> ret = new HashMap<>();
        ret.put("code", 1);
        ret.put("msg", "hello!");
        return ret;
    }


}
