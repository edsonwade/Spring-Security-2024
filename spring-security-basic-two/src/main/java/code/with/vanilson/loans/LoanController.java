package code.with.vanilson.loans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/loans")
public class LoanController {
    @GetMapping
    public String hello() {
        return "loans";
    }
}
