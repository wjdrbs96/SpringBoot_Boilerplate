package me.gyun.spring.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * created by jg 2021/03/15
 */
@RequiredArgsConstructor
@Component
public class JwtTokenProvider {

    @Value("${jwt-secret}")
    private String secretKey;

    private long tokenValidTime = 1000L * 3600 * 24 * 30;

    @PostConstruct
    private void init() {
    }
}
