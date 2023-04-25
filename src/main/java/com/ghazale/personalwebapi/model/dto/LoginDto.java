package com.ghazale.personalwebapi.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class LoginDto {

    private String username;
    private String password;
}
