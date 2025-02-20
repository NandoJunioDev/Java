package login.login.ClienteService;


import login.login.ClienteRepository.ClienteRepository;
import login.login.Clientes.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Clientes> listar() {
            return clienteRepository.findAll();


    }
    public Optional<Clientes> buscar(Long id) {
        return  clienteRepository.findById(id);

    }
    public Clientes salvar(Clientes cliente) {
        return clienteRepository.save(cliente);

    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }


}
