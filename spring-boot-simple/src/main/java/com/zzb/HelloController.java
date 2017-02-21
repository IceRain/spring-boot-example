package com.zzb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ThinkPad on 2017/2/21.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){

        return "Hello world!";
    }
}
