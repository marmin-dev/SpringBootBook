package com.springboot.api.controller;



import com.springboot.api.dto.MemeberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/get-api")
public class GetController {

    private final Logger logger = LoggerFactory.getLogger(GetController.class);
    @RequestMapping(value = "/hello",method = RequestMethod.GET) //요청형식을 GET으로
    public String getHello(){
        return "Hello World";
    }
    //매개변수가 없는 Get 메서드
    @GetMapping("/name")
    public String getName(){
        return "marmin";
    }
    //@PathVariable을 이용한 방법
    @GetMapping("variable/{variable}")
    public String getVariable(@PathVariable String variable){
        return variable;
    }
    //@PathVariable매개변수에 이름지정하기
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable")String var){
        return var;
    }
    //@RequestParam을 통해 받기
    @GetMapping(value = "/requestparam")
    @ApiOperation(value = "Get Method 예제",notes = "@Response param")
    public String getParam1(
            @ApiParam(value = "이름",required = true) @RequestParam String name,
            @ApiParam(value = "이메일",required = true) @RequestParam String email,
            @ApiParam(value = "조직",required = true) @RequestParam String organization){
        logger.info("아");
        return name + " " + email+" "+organization;
    }
    //requestParam
    @GetMapping("/requestparam2")
    public String getParam2(@RequestParam Map<String,String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map->{
            sb.append(map.getKey()+" : "+map.getValue()+"\n");
        });
        return sb.toString();
    }
    //@Dto를 통한 Get method
    @GetMapping("/requestMember")
    public String memberReturn(MemeberDto memeberDto){
        return memeberDto.toString();
    }

}
