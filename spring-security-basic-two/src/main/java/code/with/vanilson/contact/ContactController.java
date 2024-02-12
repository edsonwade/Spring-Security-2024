package code.with.vanilson.contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/contacts")
public class ContactController {
    @GetMapping
    public String hello() {
        return "welcome";
    }
}
