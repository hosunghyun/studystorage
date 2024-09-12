package com.example.site.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MemberDetailService implements UserDetailsService {
@Autowired
    private final MemberRepository memberRepository;

    public MemberDetailService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Member> result = memberRepository.findByName(username);
 
        if (result.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }

        Member member = result.get();

        List<GrantedAuthority> authorities = new ArrayList<>();
        
        if (member.getName().equals("admin")) {
            authorities.add(new SimpleGrantedAuthority("ADMIN-USER"));
        }
        else {
            authorities.add(new SimpleGrantedAuthority("NORMAL-USER"));
        }
        return new User(member.getName(), member.getPassword(), authorities);
    }
}
