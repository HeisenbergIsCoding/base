package com.person.tracingservic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class TracingServicApplication {

    public static void main(String[] args) {
        SpringApplication.run(TracingServicApplication.class, args);
    }

}
