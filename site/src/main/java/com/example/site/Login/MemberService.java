package com.example.site.Login;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    
    public Member getMemberByName(String name) {
        Optional<Member> result = memberRepository.findByName(name);

        if (result.isPresent()) {
            return result.get();
        }
        else {
            return null;
        }
    }
}