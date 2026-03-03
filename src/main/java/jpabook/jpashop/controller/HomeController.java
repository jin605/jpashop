package jpabook.jpashop.controller;

<<<<<<< HEAD
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }
=======
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
>>>>>>> b0175b21885c18726de6ca67e9798068d13720c8
}
