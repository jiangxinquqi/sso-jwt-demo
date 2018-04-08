package com.xiao.sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉<br>
 *
 * @author jianjun.xiao
 * @create 2018/4/8 15:47
 * @since 1.0.0
 */
@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SsoClient1Application {

    @GetMapping(value = "/user")
    public Authentication user(Authentication user) {
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SsoClient1Application.class, args);
    }

}
