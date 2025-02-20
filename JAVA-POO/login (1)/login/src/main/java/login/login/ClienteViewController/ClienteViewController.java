package login.login.ClienteViewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/cadastro")
public class ClienteViewController {
    @GetMapping
            public String mostrarformulario (){
        return "cadastro";
    }


}
