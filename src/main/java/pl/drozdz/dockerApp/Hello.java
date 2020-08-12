package pl.drozdz.dockerApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${envName}")
    private String envName;

    @RequestMapping("/hello")
    public String hello() {
        return "hello" + envName;
    }
}
