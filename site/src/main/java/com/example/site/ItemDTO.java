package com.example.site;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO {
    private Long id;
    private String name;
    private String password;

    public ItemDTO() {}
    public ItemDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public ItemDTO(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
