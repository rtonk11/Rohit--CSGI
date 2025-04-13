package com.example.rohitcsgi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CSGIFileWordCountResource {

    @GetMapping(value="/words", produces =  "application/json")
    public int getWords(){


        return 1;

    } 
}
