package login.loginthird.CadastroController;

import login.loginthird.Cadastros.Cadastros;
import login.loginthird.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller




public class CadastroController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/singup",method = RequestMethod.POST)
    public String cadastrar(@RequestParam String nome,@RequestParam sobrenome,  @RequestParam String email, @RequestParam senha)
    {
        Cadastros cadastro = new Cadastros();
        cadastro.setEmail(email);  // Setando o email
        cadastro.setNome(nome);
        cadastro.se
        usuarioService.cadastrar(cadastro);

        return "redirect:/login";
    }
}
