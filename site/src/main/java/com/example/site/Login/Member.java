package com.example.site.Login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 키
    private Long id;

    @Column(unique = true, nullable = false)
    // 사용자 아이디
    private String name;

    @Column(nullable = false)
    // 비밀번호
    private String password;

    public Member() {}

    public Member(String name, String password) {
        this.name = name;
        this.password = password;

    }

    public Member(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setMember(MemberDTO memberDTO) {
        this.id = memberDTO.getId();
        this.name = memberDTO.getName();
        this.password = memberDTO.getPassword();
    }
}