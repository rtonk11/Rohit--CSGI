package com.example.rohitcsgi.csgi_sample;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
public class CSGIFileWordCountResource {

    @Autowired
    WordCountService wordsCountsService ;

    @GetMapping("/words")
    @Tag(name = "get", description = "GET method for getting counts of words in the file whose length is greater than 5")
    @Operation(summary = "get Count Of Total Words greater than Five",
            description = "This function is used to provide the count of words in the file whose length is greater than 5")
    @ApiResponses({
    @ApiResponse(responseCode = "200", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Integer.class))}),
    @ApiResponse(responseCode = "404", description = "File not found",
                    content = @Content)})
    public long getCountOfTotalWordsGTFive() throws IOException{

        return wordsCountsService.getCountOfTotalWordsGTFive();

    } 

    @GetMapping("/words/{id}")
    @Tag(name = "get", description = "This function is used to provide the count of words in the file with non-case sensitive alphabet")
    @Operation(summary = "get Count Of Words With Starts With Specific Alphapet",
            description = "This function is used to provide the count of words in the file with non-case sensitive alphabet")
    @ApiResponses({
    @ApiResponse(responseCode = "200", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Integer.class))}),
    @ApiResponse(responseCode = "404", description = "File not found",
                    content = @Content)})
    public long getCountOfWordsWithStartsWithSpecificAlphapet( @Parameter(
            description = "Getting words starting with a particular non-case sensitive alphabet",
            required = true) @PathVariable String id) throws IOException{

       return wordsCountsService.getCountOfWordsWithStartsWithSpecificAlphapet(id);

    }
}
