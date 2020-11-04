package com.koreait.controller;

import com.koreait.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    // localhost:2020/api/postMethod
    @PostMapping(value = "/postMethod")
    public MultiParam postMethod(@RequestBody MultiParam multiParam){//requestbody

        return multiParam;
    }
    @PutMapping("/putMethod")
    public void put(){
        System.out.println("putMethod 호출");
    }
    @PatchMapping("/patchMethod")
    public void patch(){
        System.out.println("patchMethod 호출");
    }
    @DeleteMapping("/deleteMethod")
    public void delete(){
        System.out.println("deleteMethod 호출");
    }
}
