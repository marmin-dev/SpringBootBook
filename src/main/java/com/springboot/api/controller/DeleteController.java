package com.springboot.api.controller;

import com.springboot.api.dto.MemeberDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/api-delete")
public class DeleteController {

    @DeleteMapping("/delete")
    public String deleteRequest(@RequestBody MemeberDto dto){
        return dto.toString();

    }
}
