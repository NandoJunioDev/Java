package login.loginthird.Repository;

import login.loginthird.Cadastros.Cadastros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Cadastros,Long> {
}
