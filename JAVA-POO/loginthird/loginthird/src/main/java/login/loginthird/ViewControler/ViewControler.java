package login.loginthird.ViewControler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class ViewControler {
    @GetMapping("index")
    public String index() {
        return "Index";
    }
}
