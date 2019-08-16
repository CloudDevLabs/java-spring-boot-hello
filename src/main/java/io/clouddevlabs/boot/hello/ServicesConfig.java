package io.clouddevlabs.boot.hello;

import io.clouddevlabs.boot.hello.services.impl.HelloNameService;
import io.clouddevlabs.boot.hello.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public HelloService createHelloService() {
        return new HelloNameService("Yuri");
    }
}
