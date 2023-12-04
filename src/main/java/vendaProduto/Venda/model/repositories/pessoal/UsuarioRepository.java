package vendaProduto.Venda.model.repositories.pessoal;

import vendaProduto.Venda.model.domain.comercial.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
