package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ResponseBody
//@RequestMapping("hello")
public class HelloSpringController {
    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
    //lives at /hello/goodbye  -pt ca am pus /hello sus
//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }

    //lives at /hello/hello
    //Handler request of the form /hello?name=LaunchCode
    @RequestMapping(value="hello" , method={ RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String greeting="Hello, "+ name+"!";
        model.addAttribute("greeting", greeting);
        return "hello" ;
    }
    //Handles requests of the form /hello/LaunchCode ,same ca deasupra
    @GetMapping("hello/{name}")

    public String helloAgain(@PathVariable String name, Model model){
        String greeting = "Hello, " +name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names=new ArrayList<>();
        names.add("Launch");
        names.add("Jaha");
        names.add("JSon");
        model.addAttribute("names",names);
        return "hello-list";
    }

}
