package com.zdww.springbootpractise;


import com.zdww.springbootpractise.annotation.di.pojo.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringbootPractiseApplication {

    @RequestMapping("/test")
    @ResponseBody
    public String HelloSpringBoot(@Autowired MyDataSource myDataSource){
        System.out.println(myDataSource.toString());
        return "1";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPractiseApplication.class, args);
    }

}
