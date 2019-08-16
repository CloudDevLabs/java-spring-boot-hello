package io.clouddevlabs.boot.hello.services;

public interface HelloService {

    String sayHello() throws HelloException;

    class HelloException extends Exception {
    }
}
