package com.example.site.Login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
    private Long id;
    private String name;
    private String password;

    public MemberDTO() {}
    public MemberDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public MemberDTO(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
