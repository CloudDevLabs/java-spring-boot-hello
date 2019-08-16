package io.clouddevlabs.boot.hello.services;

import io.clouddevlabs.boot.hello.services.impl.HelloNameService;
import org.junit.Assert;
import org.junit.Test;

public class HelloNameServiceTest {

    @Test
    public void testServiceSayHello() throws HelloService.HelloException {
        String name = "asd";
        HelloService helloService = new HelloNameService(name);
        String actualResult = helloService.sayHello();
        String expectedResult = "Hello " + name;
        Assert.assertEquals(expectedResult, actualResult);
    }
}