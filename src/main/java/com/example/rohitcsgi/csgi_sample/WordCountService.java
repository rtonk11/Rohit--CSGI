package com.example.rohitcsgi.csgi_sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class WordCountService {
    

    public long getCountOfTotalWordsGTFive() throws IOException{

        long count = 0;
        Path path = Paths.get("C:\\SPRING_BOOT_WS\\sample.txt");
        try (Stream<String> lines = Files.lines(path)){
            System.out.println("path is : " + Paths.get("C:\\SPRING_BOOT_WS\\sample.txt"));

            List<String> li = lines.flatMap(line->Arrays.stream(line.split(" "))).collect(Collectors.toList());
            li.forEach(System.out::println);
            count = li.stream().filter(p->p.length()>5).count();
            System.out.println(count);
            
        } catch (IOException e){
    
        }
        return count;
    } 


     public long getCountOfWordsWithStartsWithSpecificAlphapet(@PathVariable String id) throws IOException{

       long count = 0;
       Path path = Paths.get("C:\\SPRING_BOOT_WS\\sample.txt");
        try (Stream<String> lines = Files.lines(path)){
            System.out.println("path is : " + Paths.get("C:\\SPRING_BOOT_WS\\sample.txt"));

            List<String> li = lines.flatMap(line->Arrays.stream(line.split(" "))).collect(Collectors.toList());
            count = li.stream().filter(p->p.startsWith(id) || p.startsWith(id.toLowerCase())).count();
            System.out.println(count);
            
        } catch (IOException e){
    
        }
        return count;

    }
}
