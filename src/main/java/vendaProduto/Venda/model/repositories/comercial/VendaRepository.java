package vendaProduto.Venda.model.repositories.comercial;

import vendaProduto.Venda.model.domain.comercial.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
