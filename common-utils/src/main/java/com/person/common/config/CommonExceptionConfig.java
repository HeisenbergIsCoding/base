package com.person.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.person.common.exception")
public class CommonExceptionConfig {
    // 配置類不需要實現任何方法，僅作為掃描標記
} 