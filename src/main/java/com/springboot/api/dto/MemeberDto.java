package com.springboot.api.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MemeberDto {
    private String name;
    private String email;
    private String organization;
}
