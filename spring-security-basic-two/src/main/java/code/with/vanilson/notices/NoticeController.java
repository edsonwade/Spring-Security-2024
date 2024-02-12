package code.with.vanilson.notices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/notices")
public class NoticeController {

    @GetMapping
    public String hello() {
        return "welcome notices users";
    }
}
