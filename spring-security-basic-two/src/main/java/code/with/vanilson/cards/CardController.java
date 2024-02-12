package code.with.vanilson.cards;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/cards")
public class CardController {

    @GetMapping
    public String hello() {
        return "welcome cards";
    }
}
