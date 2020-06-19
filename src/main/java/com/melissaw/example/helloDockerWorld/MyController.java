package com.melissaw.example.helloDockerWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path="/demo")
public class MyController {
    @Autowired
    private MyDataRepository myDataRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String value) {
        MyData myData = new MyData(new Date(), value);
        myDataRepository.save(myData);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<MyData> getAllUsers() {
        return myDataRepository.findAll();
    }

    @GetMapping(path="/test")
    public @ResponseBody String getHelloMessage() {
        return "Hello Docker World";
    }
}