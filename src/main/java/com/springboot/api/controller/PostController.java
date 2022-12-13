package com.springboot.api.controller;


import com.springboot.api.dto.MemeberDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping("/hellopost")
    public String postHello(){
        return "hello";
    }
    //@RequestBody를 이용한 postmethod
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String,Object> postData){
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : "+map.getValue()+"\n");
        });
        return sb.toString();
    }
    @PostMapping("/member2")
    public String postMemberDto(@RequestBody MemeberDto memeberDto){
        return memeberDto.toString();
    }
}
