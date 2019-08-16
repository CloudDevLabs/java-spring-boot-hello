package io.clouddevlabs.boot.hello;

import io.clouddevlabs.boot.hello.services.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/abc")
public class AbcController {
    private static Logger LOGGER = LoggerFactory.getLogger(AbcController.class);
    private final HelloService helloService;

    public AbcController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping()
    public String sayHello() {
        String message = null;
        try {
            message = helloService.sayHello();
        } catch (HelloService.HelloException e) {
            LOGGER.error("sayHello() failed", e);
        }
        return message;
    }

    @GetMapping("/id")
    public void sayHelloRoot(HttpServletResponse res) throws IOException {
        res.getWriter().println("res.getWriter().println");
    }
}
