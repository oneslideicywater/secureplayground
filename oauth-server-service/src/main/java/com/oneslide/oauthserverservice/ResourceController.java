package com.oneslide.oauthserverservice;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
@RequestMapping("/user")
public class ResourceController {

    @GetMapping("/userinfo")
    public User getGreetings(@AuthenticationPrincipal User user){
        return user;
    }

    @GetMapping("/greetforce")
    public String getGreeting2s(){
        return "greetings";
    }
}
