package com.person.authservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.person.authservice.exception")
public class ExceptionConfig {
    // 配置類不需要實現任何方法，僅作為掃描標記
}
