package io.clouddevlabs.boot.hello.services.impl;

import io.clouddevlabs.boot.hello.services.HelloService;

public class HelloNameService implements HelloService {
    private String name;

    public HelloNameService(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() throws HelloException {
        return "Hello " + name;
    }
}
