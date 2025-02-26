package login.loginthird.Service;

import login.loginthird.Cadastros.Cadastros;
import login.loginthird.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class
UsuarioService {

@Autowired
private UsuarioRepository usuarioRepository;


    public Cadastros cadastrar(Cadastros cadastro){
            return usuarioRepository.save(cadastro);
    }
}
