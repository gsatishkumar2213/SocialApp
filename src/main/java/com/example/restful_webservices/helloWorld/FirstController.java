package com.example.restful_webservices.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gsati on 8/21/2018.
 */
@RestController
public class FirstController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String helloMethod(){

        return "Hello World";
    }


    @GetMapping(path = "/helloBean")
    public HelloWorld helloMethoBean(){

        return new HelloWorld("Hello world");
    }

    @GetMapping(path = "/helloPathVariable/{name}")
    public HelloWorld helloMethoPathVariable(@PathVariable String name){

        return new HelloWorld(String.format("Hello world, %S", name));
    }
}
