package login.login.ClienteController;


import login.login.ClienteService.ClienteService;
import login.login.Clientes.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/clientes")


public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Clientes> listar() {
        return clienteService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Clientes> buscar(@PathVariable long id) {
        return clienteService.buscar(id);

    }

    @PostMapping()
    public Clientes salvar(@RequestBody Clientes cliente) {


        return clienteService.salvar(cliente);

    }

    @PostMapping("/salvar")
    public String salvarCliente(@RequestParam String nome, @RequestParam String email, Model model) {
        Clientes cliente = new Clientes();
        cliente.setNome(nome);
        cliente.setEmail(email);
        clienteService.salvar(cliente);

        model.addAttribute("Cadastro feito com sucesso");
        return "redirect:/cadastro";  // Retorna para a página do formulário
    }


    @DeleteMapping("/{id}")
    public void remover(@PathVariable long id) {
        clienteService.excluir(id);
    }


}
