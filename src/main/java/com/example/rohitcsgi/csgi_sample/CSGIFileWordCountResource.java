package com.example.rohitcsgi.csgi_sample;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class CSGIFileWordCountResource {

    @Autowired
    WordCountService wordsCountsService ;

    @GetMapping("/words")
    @Operation(description = "This function is used to provide the count of words in the file whose length is greater than 5" , tags = "Function 1 ")
    public long getCountOfTotalWordsGTFive() throws IOException{

        return wordsCountsService.getCountOfTotalWordsGTFive();

    } 

    @GetMapping("/words/{id}")
    @Operation(description = "This function is used to provide the count of words in the file with specific alphabet", tags = "Function 2 ")
    public long getCountOfWordsWithStartsWithSpecificAlphapet(@PathVariable String id) throws IOException{

       return wordsCountsService.getCountOfWordsWithStartsWithSpecificAlphapet(id);

    }
}
