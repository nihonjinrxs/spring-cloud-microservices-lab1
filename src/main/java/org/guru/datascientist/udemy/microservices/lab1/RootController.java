package org.guru.datascientist.udemy.microservices.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ryan on 3/7/16.
 */
@Controller
public class RootController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
