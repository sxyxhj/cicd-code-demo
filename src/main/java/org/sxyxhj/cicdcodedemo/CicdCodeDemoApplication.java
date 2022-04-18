package org.sxyxhj.cicdcodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdCodeDemoApplication {

    @GetMapping("/getInfo")
    public String getInfo(){
        return "this is demo project";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdCodeDemoApplication.class, args);
    }

}
