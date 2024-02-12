package code.with.vanilson.balance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/balance")
public class BalanceController {

    @GetMapping
    public String hello() {
        return "welcome balance";
    }
}
