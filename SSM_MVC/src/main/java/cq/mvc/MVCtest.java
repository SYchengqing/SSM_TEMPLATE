package cq.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCtest {

    @RequestMapping("/Hello")
    public String Hello(){
        return "Hello";
    }

}
