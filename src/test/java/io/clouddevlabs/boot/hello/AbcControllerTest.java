package io.clouddevlabs.boot.hello;

import io.clouddevlabs.boot.hello.services.HelloService;
import org.junit.Assert;
import org.junit.Test;

public class AbcControllerTest {

    private static class MockHelloService implements HelloService {
        @Override
        public String sayHello() throws HelloService.HelloException {
            return "testResult";
        }
    }

    @Test
    public void testSayHello() {
        AbcController controllerUnderTest = new AbcController(new MockHelloService());
        String controllerResult = controllerUnderTest.sayHello();
        Assert.assertEquals("testResult", controllerResult);
    }
}