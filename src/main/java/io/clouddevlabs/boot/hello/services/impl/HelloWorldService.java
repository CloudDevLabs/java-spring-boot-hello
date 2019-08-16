package io.clouddevlabs.boot.hello.services.impl;

import io.clouddevlabs.boot.hello.services.HelloService;
import org.springframework.stereotype.Service;

//@Service
public class HelloWorldService implements HelloService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
