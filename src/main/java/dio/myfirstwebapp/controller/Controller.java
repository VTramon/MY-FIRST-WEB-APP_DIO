package dio.myfirstwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String welcome() {
        return "Welcome  to My Spring Boot Web API";
    }
}
