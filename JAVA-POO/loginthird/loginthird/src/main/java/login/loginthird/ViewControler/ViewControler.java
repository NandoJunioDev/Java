package login.loginthird.ViewControler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/index")
public class ViewControler {
    @GetMapping("/login")
    public String index() {
        return "Login";
    }
}
