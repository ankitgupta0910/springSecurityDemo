package springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ankitgupta on 6/4/17.
 */
@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
        return "Hello";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "Private";
    }

}
