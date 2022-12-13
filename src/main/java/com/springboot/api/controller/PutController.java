package com.springboot.api.controller;

import com.springboot.api.dto.MemeberDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    @PutMapping("/putMember")
    public String putMember(@RequestBody Map<String, Object> putData){
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map->{
            sb.append(map.getKey() +" "+map.getValue());
        });
        return sb.toString();
    }
    @PutMapping("/member1")
    public String putMemberDto(@RequestBody MemeberDto memeberDto){
        return memeberDto.toString();
    }

    @PutMapping("/member2")
    public MemeberDto putMemberDto2(@RequestBody MemeberDto memberDto){
        return memberDto;
    }

}
